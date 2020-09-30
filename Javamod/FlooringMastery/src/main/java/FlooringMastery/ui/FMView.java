

package FlooringMastery.ui;

import FlooringMastery.Dto.Order;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Shantoria Taylor  

 */
public class FMView {
    
    private FMUserIO io;

    public FMView(FMUserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
         io.print("=== ERROR ===");
        io.print(errorMsg);
        displayContinue();
    }

    public void displayContinue() {
         io.readString("Please hit enter to continue.");
    }

    public int printMenuAndGetSelection() {
        System.out.println("=== Taylor Inc. Main Menu ===");
        System.out.println("1. Display Orders");
        System.out.println("2. Add an Order");
        System.out.println("3. Edit an Order");
        System.out.println("4. Remove an Order");
        System.out.println("5. Exit");

        return io.readInt("Please select from the"
                + " above options.", 1, 5);
    }

    public LocalDate inputDate() {
       return io.readDate("Please enter an order date. (MM-DD-YYYY)",
                LocalDate.of(2010, 1, 1), LocalDate.of(2050, 1, 31));
    }

    public void displayDateBanner(LocalDate dateChoice) {
        System.out.printf("=== Orders on %s ===\n", dateChoice);
    }

    public void displayOrder(Order o) {
        
        io.print("Date: " + o.getDate());
        io.print("Customer: " + o.getCustomerName());
        io.print("State: " + o.getStateAbbr());
        io.print("Tax Rate: " + o.getTaxRate() + "%");
        io.print("Product: " + o.getProductType());
        io.print("Material Cost per sq ft: "
                + io.formatCurrency(o.getMaterialCostPerSquareFoot()));
        io.print("Labor Cost per sq ft: "
                + io.formatCurrency(o.getLaborCostPerSquareFoot()));
        io.print("Area: " + o.getArea() + " sq ft");
        io.print("Material Cost: " + io.formatCurrency(o.getMaterialCost()));
        io.print("Labor Cost: " + io.formatCurrency(o.getLaborCost()));
        io.print("Tax: " + io.formatCurrency(o.getTax()));
        io.print("=== TOTAL: " + io.formatCurrency(o.getTotal()) + " ===");
    }

    public String askSave() {
      return io.readString("Would you like to save this order? Y for Yes, N for No.", 1);
    }

    public String displayAddOrderSuccessBanner(boolean b, Order o) {
        return io.readString("Your order has been successfully saved!");
    }

    public void displayEditOrderBanner() {
        System.out.println("***Edit Order***");
    }

    public void displayDateOrders(List<Order> ordersByDate) {
     for (Order o : ordersByDate) {
            io.print(o.getOrderNumber() + " | " + o.getCustomerName() + " | "
                    + io.formatCurrency(o.getTotal()));
        }
    }

    public Order getOrder() {
          Order o = new Order();
            o.setDate(inputDate());
            o.setCustomerName(inputCustomerName());
            o.setStateAbbr(inputStateAbbr());
            o.setProductType(inputProductType());
            o.setArea(inputArea());
        return o;
    }

    private String inputCustomerName() {
        return io.readString("Hello! Please enter your full name.");
    }

    private String inputStateAbbr() {
       return io.readString("Please enter your state abbreviation. Ex. NY for New York");
    }

    private String inputProductType() {
        return io.readString("Please choose your flooring product.");
    }

    private BigDecimal inputArea() {
       return io.readBigDecimal("Please enter the area of your project "
                + "in square feet.", 2, BigDecimal.ZERO);
    }

    public int inputOrderNumberBanner() {
        return io.readInt("Hello! To begin the process, you'll first need to input your order number");
    }

    public Order editOrderInfo(Order o) {
         Order editedOrder = new Order();

        io.print("Customer: " + o.getCustomerName());
        editedOrder.setCustomerName(inputCustomerName());

        io.print("State: " + o.getStateAbbr());
        editedOrder.setStateAbbr(inputStateAbbr());

        io.print("Product: " + o.getProductType());
        editedOrder.setProductType(inputProductType());

        io.print("Area: " + o.getArea() + " sq ft");
        editedOrder.setArea(inputArea());

        return editedOrder;
    }

    public void displayEditOrderSuccess(boolean successful, Order o) {
        if (successful == true) {
            io.print("Order #" + o.getOrderNumber() + " was successfully edited and saved! Thank you for using Taylor Inc. Products");
        } else {
            io.print("Order was not edited.");
            displayContinue();
        }


    }

    public void displayRemoveOrderBanner() {
        System.out.println("***Removing Order***");
    }

    public String askRemove() {
         return io.readString("Would you like to remove this order? Y/N", 1);
    }

    public void displayRemoveOrderSuccess(boolean success, Order o) {
             if (success == true) {
            io.print("Order #" + o.getOrderNumber() + " was successfully removed! Thank you for using Taylor INc. Products.");
        } else {
            io.print("There was an error. The order was not removed.");
            displayContinue();
        }
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command. We could not process your selection.");
        displayContinue();
    }

    public void displayExitBanner() {
        io.print("Thank you for using Tayor Inc. Products. ");
    }

 

    
   
    
    

    
}
