/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming3;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class BiggerBetterAdder {
    public static void main (String [] args) {
        
    Scanner myScanner = new Scanner(System.in);
        
        int cats, dogs, vampires;
        
        System.out.println("How many cats would you like to see?");
        cats = myScanner.nextInt();
        
        System.out.println("How many dogs have you had in your life?");
        dogs = myScanner.nextInt();
        
        System.out.println("How many vampires were the Cullen family?");
        vampires = myScanner.nextInt();
        
        int num1 = cats + dogs + vampires;
        
        System.out.println(cats + " + " + dogs + " + " + vampires + " = " + num1);
    }
    
}
