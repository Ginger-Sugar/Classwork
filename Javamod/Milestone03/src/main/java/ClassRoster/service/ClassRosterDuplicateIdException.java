

package ClassRoster.service;

/**
 *
 * @author Shantoria Taylor  ,  May 27, 2020  ,  12:26:10 AM

 */
public class ClassRosterDuplicateIdException extends Exception{

    public ClassRosterDuplicateIdException(String message) {
        super(message);
    }

    public ClassRosterDuplicateIdException(String message,
            Throwable cause) {
        super(message, cause);
    }
    
}
