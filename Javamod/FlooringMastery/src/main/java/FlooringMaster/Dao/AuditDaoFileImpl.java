

package FlooringMaster.Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 *
 * @author Shantoria Taylor  ,  Jul 27, 2020  ,  4:55:27 AM

 */
public class AuditDaoFileImpl implements AuditDao {

     public static final String AUDIT_FILE = "Audit.txt";

    @Override
    public void writeAuditEntry(String entry) throws FMPersistenceException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new FMPersistenceException("Could not persist audit information.", e);
        }

        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry);
        out.flush();

    }


}
