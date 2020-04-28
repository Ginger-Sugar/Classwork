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
public class KnockKnock {
    
    public static void main(String[] args) {
        
        //If you don't type in the correct capitalization, the program may not be able to recognize it.
        
        
        Scanner myScanner =  new Scanner(System.in);  
        
        System.out.println("Knock Knock! Guess who!!");
        String nameGuess = myScanner.nextLine();
        
        if(nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("............from the Future.");
        }
        
        else {System.out.println("Dude, do I look like  "+nameGuess+"  ??");
        }
    }
}