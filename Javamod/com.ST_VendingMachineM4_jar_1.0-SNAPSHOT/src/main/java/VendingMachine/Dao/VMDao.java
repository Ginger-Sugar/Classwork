/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.Dao;

import VendingMachine.Dto.Drinks;
import java.util.List;

/**
 *
 * @author Shantoria Taylor
 */
public interface VMDao {
    
    
  /**
     * It will list all available items in stock
     * @return List of items
     * @throws VendingMachine.Dao.VMPersistenceException
     */
    List<Drinks> getDrinks() throws VMPersistenceException;
    
    /**
     * It gets item name and returns item with associated  name
     * @param name 
     * @return  item
     * @throws VendingMachine.Dao.VMPersistenceException
     */
    Drinks buyDrinks(String name) throws VMPersistenceException;
    
    /**
     * 
     * @param name
     * @param drink 
     * @throws VendingMachine.Dao.VMPersistenceException 
     */
    void update(String name, Drinks drink) throws VMPersistenceException;
    Drinks addItem(Drinks drink) throws VMPersistenceException;
    

    
}
