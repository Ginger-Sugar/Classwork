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
public class GuessMeMore {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int myChoice, userChoice;
        
        myChoice = randomizer.nextInt(201)-100;
          
          for (int i = 2; i >= 0; i--) {
         
              System.out.println(" Can you guess the number I'm thinking of?");
          
          userChoice= myScanner.nextInt();
          
           if(myChoice > userChoice) {
              System.out.println("Ha, nice try - too low!  You have 1 more try!");
          }
          
           else  if(myChoice < userChoice) {
              System.out.println("Too bad, way too high. You have 1 more try!!");
           }
              
              else if (myChoice == userChoice) {
              System.out.println("Wow, nice guess! That was it! The number was " +myChoice+ " !!");
          
              return;
          }
        
           }
          }
    }

