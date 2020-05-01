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
public class FizzBuzz {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        
        System.out.println("Time to play FIZZBUZZ.");
      
        
        System.out.println();
        System.out.println("Where should I end?");
        int end =myScanner.nextInt();
        int i = 0;
        for(i=0; i <= end; i++){
            
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZBUZZ");
            }
            
            else if(i % 3 == 0){
                System.out.println("FIZZ");
            }
            
            else if( i % 5 == 0) {
                System.out.println("BUZZ");
            }
            
            else {
                    System.out.println(i);
                    }
        }
        
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    

