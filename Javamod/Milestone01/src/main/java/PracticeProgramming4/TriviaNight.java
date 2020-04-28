/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming4;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class TriviaNight {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);    
        
        int q1, q2, q3;
        
        int counter=0;
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        System.out.println();
        System.out.println("What is the Lowest Level Programming Language?\n" +
"1) Source Code		2) Assembly Language\n" +
"3) C#                                                                  4) Machine Code");
        
        q1 = myScanner.nextInt();
        
        if(q1 == 4){
            counter++;
            System.out.println("Congrats! You chose the right answer");
                 
        }
        else {
            System.out.println("#sad. Better luck next time!");
        }
        
        
       
        
        
        System.out.println();
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?\n" +
"1) Grace Hopper		2) Alan Turing\n" +
"3) Charles Babbage		4) Larry Page");
        
        q2 = myScanner.nextInt();
        
          if(q2 == 2){
            counter++;
            System.out.println("Congrats! You chose the right answer");
                 
        }
        else {
            System.out.println("#sad. Better luck next time!");
        }
          
          
          
          
          
          System.out.println();
          System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" +
"1) Serenity			2) The Battlestar Galactica\n" +
"3) The USS Enterprise	                           4) The Millennium Falcon");
          
          q3 = myScanner.nextInt();
          
          if(q3 == 3){
            counter++;
            System.out.println("Congrats! You chose the right answer");
                 
        }
        else {
            System.out.println("#sad. Better luck next time!");
        }
          
          
          if(counter > 2){
              System.out.println("Way to go! You really know your stuff!");
          }
          else{
              System.out.println("#loser");
          }
          
          
          
          System.out.println();
         System.out.println("Thanks for playing! You got "+counter+" questions correct!");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
