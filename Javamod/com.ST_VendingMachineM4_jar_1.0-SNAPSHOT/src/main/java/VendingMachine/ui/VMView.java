package VendingMachine.ui;

import VendingMachine.Dto.Drinks;
import java.util.List;

/**
 *
 * @author Shantoria Taylor  *
 */
public class VMView {

    UserIO io;

    public VMView(UserIO io) {
        this.io = io;
    }

    public void listDrinks(List<Drinks> drinks) {
        for (Drinks currentDrink : drinks) {
            io.print(currentDrink.getName() + " $" + currentDrink.getPrice());
        }
    }

    public double getPayment() {
        return io.readDouble("Insert money ");
    }

    public String getDrinks() {
        return io.readString("Choose item from the list ");
    }

    public int displayMenu() {
        io.print("Welcome to Taylor's Vending Machine!");
        io.print("1. Buy Item");
        io.print("2. Exit");

        return io.readInt("Please select from above choice: ", 1, 2);
    }

    public void displayChange(String change) {
        io.print(change);
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
    public void displayThankfulMessage(String thanks){
        io.print("Thank you for choosing Taylor Products");
    }
}
