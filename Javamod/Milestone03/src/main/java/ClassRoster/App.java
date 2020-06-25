/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRoster;

import ClassRoster.controller.ClassRosterController;
import ClassRoster.dao.ClassRosterDao;
import ClassRoster.dao.ClassRosterDaoFileImpl;
import ClassRoster.ui.ClassRosterView;
import ClassRoster.ui.UserIO;
import ClassRoster.ui.UserIOConsoleImpl;

/**
 *
 * @author Shantoria Taylor
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
    
}

