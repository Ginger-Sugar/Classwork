

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor  

 */
public class InvalidDateException extends Exception {
    
    InvalidDateException(String message) {
        super(message);
    }

    InvalidDateException(String message, Throwable cause) {
        super(message, cause);
    }

}
