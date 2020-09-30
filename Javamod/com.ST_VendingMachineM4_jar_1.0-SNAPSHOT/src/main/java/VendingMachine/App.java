

package VendingMachine;

import VendingMachine.Controller.VMController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Shantoria Taylor  

 */
public class App {
    
    public static void main(String[] args) throws Exception{
  //   UserIO myIo = new UserIOConsoleImpl();
  //      VMView myView = new VMView(myIo);
        
   //     VMDao myDao = new VMDaoImpl();
   //     VMAuditDao myAudit = new VMAuditDaoImpl();
   //     VMServiceLayer myService = new VMServiceLayerImpl(myDao, myAudit);
        
  //      VMController myController = new VMController(myView, myService);
        
  //      myController.run();
  
  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  
  VMController controller = ctx.getBean("controller", VMController.class);
  
  controller.run();
  
  
    }
}


