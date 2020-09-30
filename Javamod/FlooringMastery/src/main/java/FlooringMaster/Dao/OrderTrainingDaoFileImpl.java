

package FlooringMaster.Dao;

import FlooringMastery.Dto.Order;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor  

 */
public class OrderTrainingDaoFileImpl {
    
    private int lastOrderNumber;
    private static final String HEADER = "OrderNumber,CustomerName,State,TaxRate,"
            + "ProductType,Area,CostPerSquareFoot,LaborCostPerSquareFoot,"
            + "MaterialCost,LaborCost,Tax,Total";
    private static final String DELIMITER = ":%:";
    private String dataFolder = "orders/";

    public OrderTrainingDaoFileImpl() {
    }

    public OrderTrainingDaoFileImpl(String dataFolder) {
        this.dataFolder = dataFolder;
    }

    private void readLastOrderNumber() throws FMPersistenceException {
        Scanner scanner;

        try {
            //Create Scanner to read file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader("orders/LastOrderNumber.txt")));
        } catch (FileNotFoundException e) {
            //Throwing a general exception to the calling code
            throw new FMPersistenceException(
                    ":'( Your order could not be loaded....................#sad.", e);
        }

        int savedOrderNumber = Integer.parseInt(scanner.nextLine());

        this.lastOrderNumber = savedOrderNumber;

        scanner.close();

    }

    private void writeLastOrderNumber(int lastOrderNumber) throws FMPersistenceException {
        PrintWriter out;
        //DOES NOTHING.
    }

    public List<Order> getOrders(LocalDate chosenDate) throws FMPersistenceException {
        return loadOrders(chosenDate);
    }

    public Order addOrder(Order o) throws FMPersistenceException {
        //Checks input for commas
        o = cleanFields(o);
        //Getting the last used number, adding one, and saving it
        if (lastOrderNumber == 0) {
            readLastOrderNumber();
        }
        this.lastOrderNumber++;
        o.setOrderNumber(lastOrderNumber);
        writeLastOrderNumber(lastOrderNumber);

        List<Order> orders = loadOrders(o.getDate());
        orders.add(o);
        writeOrders(orders, o.getDate());

        return o;
    }

    public Order editOrder(Order editedOrder)
            throws FMPersistenceException {
        //Checks input for commas
        editedOrder = cleanFields(editedOrder);
        int orderNumber = editedOrder.getOrderNumber();

        List<Order> orders = loadOrders(editedOrder.getDate());
        Order chosenOrder = orders.stream()
                .filter(o -> o.getOrderNumber() == orderNumber)
                .findFirst().orElse(null);

        if (chosenOrder != null) {
            int index = orders.indexOf(chosenOrder);
            orders.set(index, editedOrder);
            writeOrders(orders, editedOrder.getDate());
            return editedOrder;
        } else {
            return null;
        }
    }

    public Order removeOrder(Order chosenOrder)
            throws FMPersistenceException {

        int orderNumber = chosenOrder.getOrderNumber();

        List<Order> orders = loadOrders(chosenOrder.getDate());
        Order removedOrder = orders.stream()
                .filter(o -> o.getOrderNumber() == orderNumber)
                .findFirst().orElse(null);

        if (removedOrder != null) {
            orders.remove(removedOrder);
            writeOrders(orders, chosenOrder.getDate());
            return removedOrder;
        } else {
            return null;
        }

    }

    private Order cleanFields(Order order) {
        //Dao does not know what the other layers are doing so its clearing delimiters
        String cleanCustomerName = order.getCustomerName().replace(DELIMITER, "");
        String cleanStateAbbr = order.getStateAbbr().replace(DELIMITER, "");
        String cleanProductType = order.getProductType().replace(DELIMITER, "");

        order.setCustomerName(cleanCustomerName);
        order.setStateAbbr(cleanStateAbbr);
        order.setProductType(cleanProductType);

        return order;
    }

    private List<Order> loadOrders(LocalDate chosenDate) throws FMPersistenceException {
        //Loads one file for a specific date
        Scanner scanner;
        String fileDate = chosenDate.format(DateTimeFormatter.ofPattern("MMddyyyy"));

        File f = new File(String.format("orders/Orders_%s.txt", fileDate));

        List<Order> orders = new ArrayList<>();

        if (f.isFile()) {
            try {
                scanner = new Scanner(
                        new BufferedReader(
                                new FileReader(f)));
            } catch (FileNotFoundException e) {
                throw new FMPersistenceException(
                        ":'( Your file could not be loaded.", e);
            }
            String currentLine;
            String[] currentTokens;
            scanner.nextLine();//Skips scanning document headers
            while (scanner.hasNextLine()) {
                currentLine = scanner.nextLine();
                currentTokens = currentLine.split(DELIMITER);
                if (currentTokens.length == 12) {
                    Order currentOrder = new Order();
                    currentOrder.setDate(LocalDate.parse(fileDate,
                            DateTimeFormatter.ofPattern("MMddyyyy")));
                    currentOrder.setOrderNumber(Integer.parseInt(currentTokens[0]));
                    currentOrder.setCustomerName(currentTokens[1]);
                    currentOrder.setStateAbbr(currentTokens[2]);
                    currentOrder.setTaxRate(new BigDecimal(currentTokens[3]));
                    currentOrder.setProductType(currentTokens[4]);
                    currentOrder.setArea(new BigDecimal(currentTokens[5]));
                    currentOrder.setMaterialCostPerSquareFoot(new BigDecimal(currentTokens[6]));
                    currentOrder.setLaborCostPerSquareFoot(new BigDecimal(currentTokens[7]));
                    currentOrder.setMaterialCost(new BigDecimal(currentTokens[8]));
                    currentOrder.setLaborCost(new BigDecimal(currentTokens[9]));
                    currentOrder.setTax(new BigDecimal(currentTokens[10]));
                    currentOrder.setTotal(new BigDecimal(currentTokens[11]));
                    orders.add(currentOrder);
                } else {
                    //Ignore line.
                }
            }
            scanner.close();
            return orders;
        } else {
            return orders;
        }
    }

    private void writeOrders(List<Order> orders, LocalDate orderDate)
            throws FMPersistenceException {
        //DOES NOTHING.
    }


}
