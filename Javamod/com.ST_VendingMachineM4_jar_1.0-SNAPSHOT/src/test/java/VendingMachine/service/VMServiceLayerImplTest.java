/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.service;

import VendingMachine.Dao.VMAuditDao;
import VendingMachine.Dao.VMDao;
import VendingMachine.Dao.VMDaoStubImpl;
import VendingMachine.Dto.Drinks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shana
 */
public class VMServiceLayerImplTest {

    private VMServiceLayer service;

    public VMServiceLayerImplTest() {

        VMDao dao = new VMDaoStubImpl();
        VMAuditDao auditDao = new VMAuditDaoStubImpl();
        service = new VMServiceLayerImpl(dao, auditDao);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getDrinks() throws Exception {

        // ARRANGE
        Drinks onlyDrink = new Drinks("Water", .60, 40);
        //Drinks onlyDrink1 = new Drinks("Iced Coffee", .90, 0);

        // ACT & ASSERT
        assertEquals(1, service.getDrinks().size(),
                "Should only have one drinks.");
        assertTrue(service.getDrinks().contains(onlyDrink),
                "Only water should be there");
        //assertTrue(service.getDrinks().contains(onlyDrink1),
        //     "Drink 1, coffee, should not be added.");

    }

    @Test
    public void buyDrinkNoStock() throws Exception {

        Drinks onlyDrink1 = new Drinks("Iced Coffee", .90, 0);

        try {
            service.buyDrinks(onlyDrink1.getName(), .90);
            fail("Apologies, the product you selected is out of stock. Expected InsufficientProductException.");
        } catch (InsufficientFundsException | InvalidSelectionException e) {
            fail("Incorrect exception was thrown.");
        } catch (InsufficientProductException e) {

        }
    }

    @Test
    public void getPaymentNotEnough() throws Exception {

        Drinks onlyDrink= new Drinks("Water", .60, 40);

        try {
            service.buyDrinks(onlyDrink.getName(), .30);
            fail(".30 is not enough to buy water. Expected exception InsufficientFunds.");

        } catch (InvalidSelectionException | InsufficientProductException e) {
            fail("Incorrect exception thrown");
        } catch (InsufficientFundsException e) {
        }
    }
    
    @Test
    public void getNameWrongName () throws Exception {
        Drinks onlyDrink1 = new Drinks("Iced Coffee", .90, 2);
        
        try {
             service.buyDrinks("Sprite", .90);
            fail( "Sprite is not a drink we sell. Expecting InvalidSelectionException.");
        } catch (InsufficientFundsException | InsufficientProductException e) {
            fail ("Incorrect exception");
        }
        catch(InvalidSelectionException e){
        }

    }
}
