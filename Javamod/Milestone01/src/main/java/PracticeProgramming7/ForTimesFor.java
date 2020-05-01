/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class ForTimesFor {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        int userInput, answer1, i=0, counter = 0, userAnswer, realAnswer;
        
        System.out.println("Which times table would you like to test?");
        userInput = myScanner.nextInt();
        
        
        for (i=0; i<16; i++) {
            
            System.out.println(userInput+" * "+i+" =");
            userAnswer = myScanner.nextInt();
            
            realAnswer = userInput * i;
            
            if(realAnswer == userAnswer){
                System.out.println("Good job!");
                counter++;
            }
            else{
                System.out.println("Wrong! The correct answer is "+realAnswer);
            }
        }
            System.out.println();
            System.out.println("You got "+counter+" questions correct.");
            if(counter > (16 * .9)){
                System.out.println();
                System.out.println(" Great job!! You made an A.");
            }
            else if(counter < (16 * .5)){
                System.out.println();
                System.out.println("/n You failed. You must study more!");
            }
            else{
                System.out.println();
                System.out.println("/n You should work harder to get get an A.");
            }
        }
        
        
        
        
        
        
        
        
    }
    
}
