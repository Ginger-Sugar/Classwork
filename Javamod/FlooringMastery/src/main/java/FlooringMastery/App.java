

package FlooringMastery;

import FlooringMastery.Controller.FMController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Shantoria Taylor  

 */
public class App {
    
    public static void main (String [] args) throws Exception {
    
        //FMUserIO my Io = new FMUserIOConsoleImpl();
        //FMView myView = new FMView (myIo);
       //FMController myController = new FMController(myView, myService);
       //myController.run();
       
       ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("applicationContext.xml");
        FMController controller =  ctx.getBean("controller", FMController.class);
        controller.run();
}
}