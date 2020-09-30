/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringMaster.Dao;

/**
 *
 * @author Shantoria Taylor
 */
public interface AuditDao {
    
     public void writeAuditEntry(String entry) throws FMPersistenceException;
    
}
