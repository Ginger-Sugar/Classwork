/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.Dao;

import VendingMachine.Dto.Drinks;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author shana
 */
public class VMDaoImplTest {
    
    VMDao testDao;
    private Map<String, Drinks> drink = new HashMap<>();
    
    public VMDaoImplTest() {
        
    }

    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception{
        String testFile = "testInventory.txt";
        FileWriter fileWriter = new FileWriter(testFile);
        testDao = new VMDaoImpl(testFile);
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testAddUpdateGetDrinks() throws VMPersistenceException {
        //Arrange
        
        String name = "Tea";
        Double price = 2.20;
        int quantity = 10;
        
        Drinks drink1 = new Drinks(name, price, quantity);
        Drinks drink2 = new Drinks("Juice", 0.99,5);
        
        
        //Act
        Drinks test1 = testDao.addItem(drink1);
        Drinks test2 = testDao.addItem( drink2);
        testDao.update(name, drink2);
        
        
        List<Drinks> list = testDao.getDrinks();
        
        
        
        //ASSERT
        
      assertEquals(2, list.size());
       assertEquals(test1,test2);
        
    }
    
}
