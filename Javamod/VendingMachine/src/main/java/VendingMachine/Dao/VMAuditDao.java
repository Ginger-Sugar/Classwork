/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.Dao;

/**
 *
 * @author Shantoria Taylor
 */
public interface VMAuditDao {
    
    public void writeEntry(String entry) throws VMPersistenceException; 
    
}
