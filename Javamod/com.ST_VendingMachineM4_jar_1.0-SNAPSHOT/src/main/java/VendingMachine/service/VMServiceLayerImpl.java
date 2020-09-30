package VendingMachine.service;

import VendingMachine.Dao.VMAuditDao;
import VendingMachine.Dao.VMDao;
import VendingMachine.Dao.VMPersistenceException;
import VendingMachine.Dto.Drinks;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Shantoria Taylor  *
 */
public class VMServiceLayerImpl implements VMServiceLayer {

    VMDao dao;
    VMAuditDao audit;
    Change change;
    BigDecimal customerCash, itemPrice;

    public VMServiceLayerImpl(VMDao dao, VMAuditDao audit) {
        this.dao = dao;
        this.audit = audit;

    }

    @Override
    public List<Drinks> getDrinks() throws VMPersistenceException {

        List<Drinks> drinksList = dao.getDrinks();
        return drinksList.stream()
                .filter((x) -> x.getQuantity() != 0)
                .collect(Collectors.toList());
    }

    @Override
    public String buyDrinks(String name, double cash) throws VMPersistenceException, InsufficientFundsException, InsufficientProductException, InvalidSelectionException {

         validateDrink(name);
        Drinks drink = dao.buyDrinks(name);
        int count = drink.getQuantity() - 1;
        if (cash < drink.getPrice()) {
            throw new InsufficientFundsException("Sorry, please insert enough money to buy " + drink.getName() + " . The is cost " + drink.getName() + " is $" + drink.getPrice());
        }
        drink.setQuantity(count);
        dao.update(name, drink);
        audit.writeEntry(name);
        customerCash = new BigDecimal(Double.toString(cash));
        BigDecimal drinkPrice = new BigDecimal(Double.toString(drink.getPrice()));
        change = new Change(customerCash.subtract(drinkPrice));
        return change.calculate();
        //  if(change>)
    }

    private void validateDrink(String drinks) throws InsufficientProductException, InvalidSelectionException, VMPersistenceException {
        if (dao.buyDrinks(drinks) == null) {
            throw new InvalidSelectionException("The item you selected does not exist. Please try again.");
        } else if (dao.buyDrinks(drinks).getQuantity() == 0) {
            throw new InsufficientProductException("Our apologies. The item is out of stock.");
        }

    }

}
