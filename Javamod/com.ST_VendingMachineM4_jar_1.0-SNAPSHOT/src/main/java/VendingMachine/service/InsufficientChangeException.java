

package VendingMachine.service;

/**
 *
 * @author Shantoria Taylor 

 */
public class InsufficientChangeException extends Exception{
    
    public InsufficientChangeException(String message) {
        super(message);
    }
    
    public InsufficientChangeException(String message, Throwable cause) {
        super(message, cause);
    }

}
