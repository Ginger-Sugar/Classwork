/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shana
 */
public class GuessMeFinally {
        
     public static void main(String[] args) {
         
         Random randomizer = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int myChoice, userChoice, guessNum = 0;
        
        myChoice = randomizer.nextInt(201)-100;
          
         
              System.out.println(" Can you guess the number I'm thinking of between -100 and 100?");
          
          userChoice= myScanner.nextInt();
          
           if(myChoice > userChoice) {
              System.out.println("Ha, nice try - too low!  You have 1 more try!");
          }
          
           else  if(myChoice < userChoice) {
              System.out.println("Too bad, way too high. You have 1 more try!!");
           }
              
              else {
               
           
               if(guessNum == 0) {
                   
              System.out.println("Wow, nice guess! That was it! The number was " +myChoice+ " !!");
              return; }
               
               else if(guessNum > 0) {
                   System.out.println("It took you long enough!");
              return; }
           }
              guessNum++;
          
        
           }
          }
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
