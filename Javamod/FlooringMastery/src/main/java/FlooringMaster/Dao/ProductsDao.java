/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringMaster.Dao;

import FlooringMastery.Dto.Product;

/**
 *
 * @author Shantoria Taylor
 */

public interface ProductsDao {
    
     Product getProduct(String productType) throws FMPersistenceException;
    
}
