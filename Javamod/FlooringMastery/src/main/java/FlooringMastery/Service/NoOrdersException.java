

package FlooringMastery.Service;

/**
 *
 * @author Shantoria Taylor  

 */
public class NoOrdersException extends Exception {
    
    NoOrdersException(String message) {
        super(message);
    }

    NoOrdersException(String message, Throwable cause) {
        super(message, cause);
    }

}
