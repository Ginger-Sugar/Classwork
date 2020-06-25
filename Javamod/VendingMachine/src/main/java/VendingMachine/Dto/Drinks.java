

package VendingMachine.Dto;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Shantoria Taylor  

 */
public class Drinks {
    
    private String name;
    private Double price;
    private int quantity;

    public Drinks (String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.price);
        hash = 41 * hash + this.quantity;
        return hash;
    }

    @Override
    public String toString() {
        return "Drink {" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Drinks other = (Drinks) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
    
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}


