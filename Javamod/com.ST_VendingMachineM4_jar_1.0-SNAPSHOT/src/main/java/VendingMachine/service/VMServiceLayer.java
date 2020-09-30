/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.service;

import VendingMachine.Dao.VMPersistenceException;
import VendingMachine.Dto.Drinks;
import java.util.List;



/**
 *
 * @author Shantoria Taylor
 */
public interface VMServiceLayer {
    
 
    List<Drinks> getDrinks() throws VMPersistenceException;
    
  
    String buyDrinks(String name, double price) throws VMPersistenceException, InvalidSelectionException, InsufficientFundsException, InsufficientProductException;
    
    /**
     *
     * @param name
     * @param change
     * @return
     * @throws InsufficientChangeException
     */
    //String checkChange(String name, double change) throws InsufficientChangeException;
    
    
}
