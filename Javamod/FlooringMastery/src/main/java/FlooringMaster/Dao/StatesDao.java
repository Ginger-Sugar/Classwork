/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringMaster.Dao;

import FlooringMastery.Dto.State;

/**
 *
 * @author Shantoria Taylor
 */
public interface StatesDao {
    
     State getState(String stateAbbr) throws FMPersistenceException;
    
}
