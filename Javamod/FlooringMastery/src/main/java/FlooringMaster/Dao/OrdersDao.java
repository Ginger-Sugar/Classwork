/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringMaster.Dao;

import FlooringMastery.Dto.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Shantoria Taylor
 */
public interface OrdersDao {
    
    List<Order> getOrders(LocalDate dateChoice) throws FMPersistenceException;

    Order addOrder(Order o) throws FMPersistenceException;

    Order editOrder(Order editedOrder) throws FMPersistenceException;

    Order removeOrder(Order o) throws FMPersistenceException;
    
}
