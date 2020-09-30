

package FlooringMastery.Controller;

import FlooringMaster.Dao.FMPersistenceException;
import FlooringMastery.Dto.Order;
import FlooringMastery.Service.FMService;
import FlooringMastery.Service.InvalidEntryException;
import FlooringMastery.Service.InvalidSelectionException;
import FlooringMastery.Service.InvalidStateException;
import FlooringMastery.Service.NoOrdersException;
import FlooringMastery.ui.FMView;
import java.time.LocalDate;

/**
 *
 * @author Shantoria Taylor  

 */
public class FMController {
    
        FMService service;
        FMView view;

    public FMController(FMService service, FMView view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws InvalidEntryException {

        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        getOrdersByDate();
                        break;
                    case 2:
                        addOrder();
                        break;
                    case 3:
                        editOrder();
                        break;
                    case 4:
                        removeOrder();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (FMPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void getOrdersByDate() throws FMPersistenceException {
        LocalDate dateChoice = view.inputDate();
        view.displayDateBanner(dateChoice);
        try {
            view.displayDateOrders(service.getOrders(dateChoice));
            view.displayContinue();
        }
        catch (NoOrdersException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void addOrder() throws FMPersistenceException {
        try {
            Order o = service.calculateOrder(view.getOrder());
            view.displayOrder(o);
            String response = view.askSave();
            if (response.equalsIgnoreCase("Y")) {
                service.addOrder(o);
                view.displayAddOrderSuccessBanner(true, o);
            } else if (response.equalsIgnoreCase("N")) {
                view.displayAddOrderSuccessBanner(false, o);
            } else {
                unknownCommand();
            }
        } catch (InvalidStateException | InvalidSelectionException | InvalidEntryException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void editOrder() throws FMPersistenceException, InvalidEntryException {
        view.displayEditOrderBanner();
        try {
            LocalDate dateChoice = view.inputDate();
            int orderNumber = view.inputOrderNumberBanner();
            Order savedOrder = service.getOrder(dateChoice, orderNumber);
            Order editedOrder = view.editOrderInfo(savedOrder);
            Order updatedOrder = service.compareOrders(savedOrder, editedOrder);
            view.displayEditOrderBanner();
            view.displayOrder(updatedOrder);
            String response = view.askSave();
            if (response.equalsIgnoreCase("Y")) {
                service.editOrder(updatedOrder);
                view.displayEditOrderSuccess(true, updatedOrder);
            } else if (response.equalsIgnoreCase("N")) {
                view.displayEditOrderSuccess(false, updatedOrder);
            } else {
                unknownCommand();
            }
        } catch (NoOrdersException
                | InvalidSelectionException | InvalidStateException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void removeOrder() throws FMPersistenceException {
        view.displayRemoveOrderBanner();
        LocalDate dateChoice = view.inputDate();
        view.displayDateBanner(dateChoice);
        try {
            view.displayDateOrders(service.getOrders(dateChoice));
            int orderNumber = view.inputOrderNumberBanner();
            Order o = service.getOrder(dateChoice, orderNumber);
            view.displayRemoveOrderBanner();
            view.displayOrder(o);
            String response = view.askRemove();
            if (response.equalsIgnoreCase("Y")) {
                service.removeOrder(o);
                view.displayRemoveOrderSuccess(true, o);
            } else if (response.equalsIgnoreCase("N")) {
                view.displayRemoveOrderSuccess(false, o);
            } else {
                unknownCommand();
            }
        } catch (NoOrdersException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

}
