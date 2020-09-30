

package VendingMachine;

import VendingMachine.Controller.VMController;
import VendingMachine.Dao.VMAuditDao;
import VendingMachine.Dao.VMAuditDaoImpl;
import VendingMachine.Dao.VMDao;
import VendingMachine.Dao.VMDaoImpl;
import VendingMachine.service.VMServiceLayer;
import VendingMachine.service.VMServiceLayerImpl;
import VendingMachine.ui.UserIO;
import VendingMachine.ui.UserIOConsoleImpl;
import VendingMachine.ui.VMView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Shantoria Taylor  

 */
public class App {
    
    public static void main(String[] args) throws Exception{
//     UserIO myIo = new UserIOConsoleImpl();
//        VMView myView = new VMView(myIo);
//        
//       VMDao myDao = new VMDaoImpl();
//        VMAuditDao myAudit = new VMAuditDaoImpl();
//        VMServiceLayer myService = new VMServiceLayerImpl(myDao, myAudit);
//        
//        VMController myController = new VMController(myView, myService);
//        
//       myController.run();
       
       ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("applicationContext.xml");
        VMController controller =  ctx.getBean("controller", VMController.class);
        controller.run();
    }
}


