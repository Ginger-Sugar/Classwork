/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class HighRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int rollRes = rand.nextInt(6)+1;
        String answer1;
        
        System.out.println("Before we begin, how many sides does a die have?");
        answer1 = myScanner.nextLine();
       
       System.out.println("TIME TO ROLLL THE DICE!");
        System.out.println("You rolled a " + rollRes);
        
        if(rollRes == 1) {
            System.out.println("You rolled a critical failure!");
        }
        else if( rollRes == 6) {
            System.out.println("You rolled a critical! Nice job!");
        }
        
        
        
        
    }
    
}
}
