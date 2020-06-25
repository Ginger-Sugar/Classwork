package VendingMachine.Controller;

import VendingMachine.Dao.VMPersistenceException;
import VendingMachine.Dto.Drinks;
import VendingMachine.service.InsufficientChangeException;
import VendingMachine.service.InsufficientFundsException;
import VendingMachine.service.InsufficientProductException;
import VendingMachine.service.InvalidSelectionException;
import VendingMachine.service.VMServiceLayer;
import VendingMachine.ui.VMView;
import java.util.List;

/**
 *
 * @author Shantoria Taylor *
 */
public class VMController {

    private VMView view;
    private VMServiceLayer service;

    public VMController(VMView view, VMServiceLayer service) {

        this.view = view;
        this.service = service;
    }

    public void run() throws Exception {

        int choice = 0;
        boolean keepGoing = true;

        while (keepGoing) {
            choice = view.displayMenu();

            switch (choice) {
                case 1:
                    displayDrinks();
                    getMoney();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, you did not enter a valid selection. ");
                    break;

            }
        }
    }

    private void displayDrinks() throws Exception, InvalidSelectionException {

        List<Drinks> drinks = service.getDrinks();
        view.listDrinks(drinks);
    }

    public void getMoney() throws InvalidSelectionException, VMPersistenceException, InsufficientFundsException, InsufficientProductException {

        try {
            double cash = view.getPayment();
            String drinkSelected = view.getDrinks();
            String change = service.buyDrinks(drinkSelected, cash);
            view.displayChange(change);
            String thanks="";
            view.displayThankfulMessage(thanks);

        } catch (InvalidSelectionException
                | VMPersistenceException
                | InsufficientFundsException
                | InsufficientProductException e) {

            view.displayErrorMessage(e.getMessage());

        }
    }

}
