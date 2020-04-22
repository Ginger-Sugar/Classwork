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
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {
        
        int meaningOfLife = 42;
        double pi = 3.14159;
        String cheese = null, color = null;
        
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals:");
        Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is the meaning of life, the universe and everything?");
        
        System.out.println("What is your favorite kind of cheese?");
        inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more?");
        inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLife));
        
        
        
    }
    
}
