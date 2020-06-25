

package VendingMachine.service;

/**
 *
 * @author Shantoria Taylor  

 */
public class InvalidSelectionException extends Exception{
    
    public InvalidSelectionException(String message) {
        super(message);
    }
    
    public InvalidSelectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
