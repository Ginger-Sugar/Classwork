

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor 

 */
public class NegativeNumberException extends Exception {
    
    NegativeNumberException(String message) {
        super(message);
    }

    NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
