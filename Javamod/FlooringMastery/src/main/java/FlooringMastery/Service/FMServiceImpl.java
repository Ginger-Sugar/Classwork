

package FlooringMastery.Service;

import FlooringMaster.Dao.AuditDao;
import FlooringMaster.Dao.FMPersistenceException;
import FlooringMaster.Dao.OrdersDao;
import FlooringMaster.Dao.ProductsDao;
import FlooringMaster.Dao.StatesDao;
import FlooringMastery.Dto.Order;
import FlooringMastery.Dto.Product;
import FlooringMastery.Dto.State;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Shantoria Taylor  

 */
public class FMServiceImpl implements FMService{
    
    private OrdersDao ordersDao;
    private ProductsDao productsDao;
    private StatesDao statesDao;
    private AuditDao auditDao;

    public FMServiceImpl(OrdersDao ordersDao, ProductsDao productsDao,
            StatesDao statesDao, AuditDao auditDao) {
        this.ordersDao = ordersDao;
        this.productsDao = productsDao;
        this.statesDao = statesDao;
        this.auditDao = auditDao;
    }

    @Override
    public List<Order> getOrders(LocalDate chosenDate) throws NoOrdersException,
            FMPersistenceException {
        List<Order> ordersByDate = ordersDao.getOrders(chosenDate);
        if (!ordersByDate.isEmpty()) {
            return ordersByDate;
        } else {
            throw new NoOrdersException("ERROR: No orders "
                    + "exist on that date.");
        }
    }

    @Override
    public Order getOrder(LocalDate chosenDate, int orderNumber) throws
            FMPersistenceException, NoOrdersException {
        List<Order> orders = getOrders(chosenDate);
        Order chosenOrder = orders.stream()
                .filter(o -> o.getOrderNumber() == orderNumber)
                .findFirst().orElse(null);
        if (chosenOrder != null) {
            return chosenOrder;
        } else {
            throw new NoOrdersException("ERROR: No orders with that number "
                    + "exist on that date. Please check the order number you entered and try again.");
        }
    }

    @Override
    public Order calculateOrder(Order o) throws FMPersistenceException,
            InvalidEntryException, InvalidStateException, InvalidSelectionException {

        validateOrder(o);
        calculateTax(o);
        calculateMaterial(o);
        calculateTotal(o);

        return o;

    }

    private void calculateTax(Order o) throws FMPersistenceException,
            InvalidStateException {
        //Set state information in order.
        State chosenState = statesDao.getState(o.getStateAbbr());
        if (chosenState == null) {
            throw new InvalidStateException("ERROR: We do not provide services to the state you entered ");
        }
        o.setStateAbbr(chosenState.getStateAbbr());
        o.setTaxRate(chosenState.getTaxRate());
    }

    private void calculateMaterial(Order o) throws FMPersistenceException,
            InvalidSelectionException {
        //Set product information in order.
        Product chosenProduct = productsDao.getProduct(o.getProductType());
        if (chosenProduct == null) {
            throw new InvalidSelectionException("ERROR: We do not have the product you selected in stock. Please try again.");
        }
        o.setProductType(chosenProduct.getProductType());
        o.setMaterialCostPerSquareFoot(chosenProduct.getMaterialCostPerSquareFoot());
        o.setLaborCostPerSquareFoot(chosenProduct.getLaborCostPerSquareFoot());
    }

    private void calculateTotal(Order o) {
        //Calculate other order fields.
        o.setMaterialCost(o.getMaterialCostPerSquareFoot().multiply(o.getArea())
                .setScale(2, RoundingMode.HALF_UP));
        o.setLaborCost(o.getLaborCostPerSquareFoot().multiply(o.getArea())
                .setScale(2, RoundingMode.HALF_UP));
        o.setTax(o.getTaxRate().divide(new BigDecimal("100.00"))
                .multiply((o.getMaterialCost().add(o.getLaborCost())))
                .setScale(2, RoundingMode.HALF_UP));
        o.setTotal(o.getMaterialCost().add(o.getLaborCost()).add(o.getTax()));
    }

    private void validateOrder(Order o) throws InvalidEntryException {
        String message = "";
        if (o.getCustomerName().trim().isEmpty() || o.getCustomerName() == null) {
            message += "Customer name is required.\n";
        }
        if (o.getStateAbbr().trim().isEmpty() || o.getStateAbbr() == null) {
            message += "State is required.\n";
        }
        if (o.getProductType().trim().isEmpty() || o.getProductType() == null) {
            message += "Product type is required.\n";
        }
        if (o.getArea().compareTo(BigDecimal.ZERO) > 100 || o.getArea() == null) {
            message += "Area square footage is required and be more than 100 square feet.";
        }
        if (!message.isEmpty()) {
            throw new InvalidEntryException(message);
        }
    }

    @Override
    public Order addOrder(Order o) throws FMPersistenceException {
        ordersDao.addOrder(o);
        auditDao.writeAuditEntry("Order #"
                + o.getOrderNumber() + " for date "
                + o.getDate() + " ADDED.");
        return o;
    }

    @Override
    public Order compareOrders(Order savedOrder, Order editedOrder)
            throws FMPersistenceException, InvalidStateException,
            InvalidSelectionException {

        //This will only update the already saved order's fields
        if (editedOrder.getCustomerName() == null
                || editedOrder.getCustomerName().trim().equals("")) {
            //No change
        } else {
            savedOrder.setCustomerName(editedOrder.getCustomerName());
        }

        if (editedOrder.getStateAbbr() == null
                || editedOrder.getStateAbbr().trim().equals("")) {
        } else {
            savedOrder.setStateAbbr(editedOrder.getStateAbbr());
            calculateTax(savedOrder);
        }

        if (editedOrder.getProductType() == null
                || editedOrder.getProductType().equals("")) {
        } else {
            savedOrder.setProductType(editedOrder.getProductType());
            calculateMaterial(savedOrder);
        }

        if (editedOrder.getArea() == null
                || (editedOrder.getArea().compareTo(BigDecimal.ZERO)) == 0) {
        } else {
            savedOrder.setArea(editedOrder.getArea());
        }

        calculateTotal(savedOrder);

        return savedOrder;
    }

    @Override
    public Order editOrder(Order updatedOrder) throws FMPersistenceException,
            NoOrdersException {
        updatedOrder = ordersDao.editOrder(updatedOrder);
        if (updatedOrder != null) {
            auditDao.writeAuditEntry("Order #"
                    + updatedOrder.getOrderNumber() + " for date "
                    + updatedOrder.getDate() + " EDITED.");
            return updatedOrder;
        } else {
            throw new NoOrdersException("ERROR: We could not find the order number you mentioned. Please check your number and try again.");
        }
    }

    @Override
    public Order removeOrder(Order removedOrder) throws FMPersistenceException,
            NoOrdersException {
        removedOrder = ordersDao.removeOrder(removedOrder);
        if (removedOrder != null) {
            auditDao.writeAuditEntry("Order #"
                    + removedOrder.getOrderNumber() + " for date "
                    + removedOrder.getDate() + " REMOVED.");
            return removedOrder;
        } else {
            throw new NoOrdersException("ERROR: ERROR: We could not find the order number you mentioned. Please check your number and try again.");
        }
    }




}
