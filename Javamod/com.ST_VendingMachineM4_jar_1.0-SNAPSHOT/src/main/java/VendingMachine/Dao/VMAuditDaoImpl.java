

package VendingMachine.Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shantoria Taylor 

 */
public class VMAuditDaoImpl implements VMAuditDao {
    
     public final static String  AUDIT_TXT = "drinksauditfile.txt";
    
    @Override
    public void writeEntry(String message) throws VMPersistenceException{
       
        PrintWriter out = null;
        
        
        try{
           out = new PrintWriter(new FileWriter(AUDIT_TXT, true));
           
        }catch(IOException ex){
            try {
                throw new IOException(ex);
            } catch (IOException ex1) {
                Logger.getLogger(VMAuditDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
           LocalDateTime timeStamp = LocalDateTime.now();
           String timeStampStr = timeStamp.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
           out.println(timeStampStr + " " + message + " sold");
           out.flush();
           out.close();
            
    }
    

}
