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
public class GuessMe {
    
    public static void main(String[] args) {
        int myChoice, userChoice;
        
         myChoice = 7;
         
          Scanner myScanner = new Scanner(System.in);
          
          
          System.out.println("Hello!! Can you guess the number I'm thinking of?");
          userChoice= myScanner.nextInt();
          
          if(myChoice == userChoice) {
              System.out.println("Wow, nice guess! That was it!");
          }
          
          if(myChoice > userChoice) {
              System.out.println("Ha, nice try - too low! I chose " +myChoice+" .");
          }
          
          if(myChoice < userChoice) {
              System.out.println("Too bad, way too high. I chose  " +myChoice+" .");
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    }
   
    
    
    
    
    
    
    
    
    
    
}
