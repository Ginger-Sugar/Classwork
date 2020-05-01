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
public class TheCount {
    public static void main(String[] args) {
       Scanner myScanner = new Scanner (System.in);
       
       int first, last, increment;
       
        System.out.println("Please provide a beginning number.");
       first = myScanner.nextInt();
       
        System.out.println();
        System.out.println("Please provide an ending number.");
        last = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Now, by how much would you like to increment?");
       increment = myScanner.nextInt();
        int i;
       
       for( i = first; i <= last; i = increment +i){
           
           System.out.println("");
           System.out.println(i+ " ");
       }
      
       
    }
    
}
