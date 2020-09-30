

package VendingMachine.service;

/**
 *
 * @author Shantoria Taylor 

 */
public class InsufficientProductException extends Exception {
    
    public  InsufficientProductException ( String message) {
        super(message);
    }
    
    public InsufficientProductException(String message, Throwable cause) {
        super(message, cause);
    }

}
