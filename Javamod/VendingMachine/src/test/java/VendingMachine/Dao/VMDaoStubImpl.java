package VendingMachine.Dao;

import VendingMachine.Dto.Drinks;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shantoria Taylor
 *
 */
public class VMDaoStubImpl implements VMDao {

    public Drinks onlyDrink;
    public Drinks onlyDrink1;

    public VMDaoStubImpl() {

        onlyDrink = new Drinks("Water", .60, 40);
        onlyDrink1 = new Drinks("Iced Coffee", .90, 0);
    }

    public VMDaoStubImpl(Drinks testDrink) {

        this.onlyDrink = testDrink;
    }

    @Override
    public List<Drinks> getDrinks() throws VMPersistenceException {

        List<Drinks> drinkList = new ArrayList<>();
        drinkList.add(onlyDrink);
        drinkList.add(onlyDrink1);
        return drinkList;
    }

    @Override
    public Drinks buyDrinks(String name) throws VMPersistenceException {
        if (name.equals(onlyDrink.getName())) {
            return onlyDrink;
        } else if (name.equals(onlyDrink1.getName())) {
            return onlyDrink1;
        } else {
            return null;
        }
    }

    @Override
    public void update(String name, Drinks drink) throws VMPersistenceException {
        onlyDrink.setPrice(drink.getPrice());
        onlyDrink.setQuantity(drink.getQuantity());

    }

    @Override
    public Drinks addItem(Drinks drink) throws VMPersistenceException {
        return null;
    }

}
