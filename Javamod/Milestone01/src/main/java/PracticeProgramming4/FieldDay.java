/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming4;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class FieldDay {
    public static void main(String[] args) {
        
        
          Scanner myScanner =  new Scanner(System.in);  
          
          String lastName;
          
          System.out.println("Hello!! Please enter your last name.");
          lastName = myScanner.nextLine();
        
        if(lastName.compareToIgnoreCase("Baggins") <= 0) {
            System.out.println("The Sorting Hat says: RED DRAGONS!");
        }
        
        else if(lastName.compareToIgnoreCase("Baggins") > 0 && lastName.compareToIgnoreCase("Dresden") <= 0){
            System.out.println("The Sorting Hat says: DARK WIZARDS!");
        }
        
        else if(lastName.compareToIgnoreCase("Dresden") > 0 && lastName.compareToIgnoreCase("Howl") <= 0){
            System.out.println("The Sorting Hat says: MOVING CASTLES!");
        }
        
        else if(lastName.compareToIgnoreCase("Howl") > 0 && lastName.compareToIgnoreCase("Potter") <= 0){
            System.out.println("The Sorting Hat says: GOLDEN SNITCHES!");
        }
        
        else if(lastName.compareToIgnoreCase("Potter") > 0 && lastName.compareToIgnoreCase("Vimes") <= 0){
            System.out.println("The Sorting Hat says: NIGHT GUARDS!");
        }
        
        else if( lastName.compareToIgnoreCase("Vimes") >0) {
        System.out.println("The Sorting Hat says: BLACK HOLES!");
    }
        
        System.out.println("Good luck in the games and let the odds be ever in your favor");
    
        
    }
    
}
