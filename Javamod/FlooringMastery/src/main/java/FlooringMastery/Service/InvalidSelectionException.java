

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor  

 */
public class InvalidSelectionException extends Exception {
    
    InvalidSelectionException(String message) {
        super(message);
    }

    InvalidSelectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
