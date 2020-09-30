/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringMastery.Service;

import FlooringMaster.Dao.FMPersistenceException;
import FlooringMastery.Dto.Order;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Shantoria Taylor
 */
public interface FMService {
    
     List<Order> getOrders(LocalDate dateChoice) throws NoOrdersException,
            FMPersistenceException;

    Order calculateOrder(Order o) throws FMPersistenceException,
            InvalidEntryException, InvalidStateException, InvalidSelectionException;

    Order getOrder(LocalDate dateChoice, int orderNumber) throws
            FMPersistenceException, NoOrdersException;

    Order addOrder(Order o) throws FMPersistenceException;

    Order compareOrders(Order savedOrder, Order editedOrder)
            throws FMPersistenceException, InvalidStateException,
            InvalidEntryException, InvalidSelectionException;

    Order editOrder(Order updatedOrder) throws FMPersistenceException,
            NoOrdersException;

    Order removeOrder(Order removedOrder) throws FMPersistenceException,
            NoOrdersException;

    
}
