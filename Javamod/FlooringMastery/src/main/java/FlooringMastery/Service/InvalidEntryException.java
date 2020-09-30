

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor  

 */
public class InvalidEntryException extends Exception {
    
    InvalidEntryException(String message) {
        super(message);
    }

    InvalidEntryException(String message, Throwable cause) {
        super(message, cause);
    }

}
