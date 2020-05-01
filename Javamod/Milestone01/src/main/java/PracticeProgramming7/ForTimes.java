/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class ForTimes {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int userInput;
        int i =0;
        
        System.out.println("Which times table shall I recite?");
        userInput = myScanner.nextInt();
        
        for (i=0; i<16; i++) {
            
            System.out.println(i +" * "+userInput+ " is: "+ (i * userInput));
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}
