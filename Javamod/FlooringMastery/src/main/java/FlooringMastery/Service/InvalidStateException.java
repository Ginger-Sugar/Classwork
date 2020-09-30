

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor 

 */
public class InvalidStateException extends Exception {
    
    InvalidStateException(String message) {
        super(message);
    }

    InvalidStateException(String message, Throwable cause) {
        super(message, cause);
    }

}
