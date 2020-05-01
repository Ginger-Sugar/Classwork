/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizer;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class Factorizer {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        int userInput, factorSum=0, factors=0, i;
        
        System.out.println("It's time to factor!! Give me a number. Any (positive) number!");
        userInput = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Okay, you chose the number ***"+userInput+" ***");
        
        System.out.println();
        System.out.println("Now, let's see what the factors of  "+userInput+" are!!");
        System.out.println();
        
        
        for(i=1; i <= userInput;i++){
            
            if(userInput % i ==0){
                System.out.println(i + " ");
                factors++;
                factorSum= factorSum + i;
                        
            }
        
        }
        if(factors == 2){
            System.out.println();
            System.out.println("The test says "+userInput+" IS a prime number!!");
        }
        else{
            System.out.println();
            System.out.println("The test says "+userInput+ " IS NOT a prime number.");
        }
        
        if((factorSum - userInput) == userInput){
            System.out.println();
            System.out.println("The test says "+userInput+" IS a perfect number.");
        }
        else{
            System.out.println();
            System.out.println("The test says "+userInput+" IS NOT a perfect number.");
        }
        
        }
        
        
        
        
        
        
        
    }
   
