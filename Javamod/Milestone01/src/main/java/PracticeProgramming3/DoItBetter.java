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
public class DoItBetter {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int miles, hotDogs, yuyan, miles1, hotDogs1, yuyan1;
        
        
        System.out.println("Hey, how many miles can you run??");
        miles = myScanner.nextInt();
        miles1 = (miles * 2) + 1;
        System.out.println("Catch up, slow poke! " +miles+ "???? I could run that in my sleep! I run " +miles1+ " every day!");

        
        System.out.println();
        System.out.println("How many hot dogs can you eat in 10 minutes?");
        hotDogs = myScanner.nextInt();
        hotDogs1 = (hotDogs * 2) + 1;
        System.out.println(hotDogs+ "??? What are you, a child? I could down " +hotDogs1+ " easy.");
        
        System.out.println();
        System.out.println("How many languages can you speak?");
        yuyan = myScanner.nextInt();
        yuyan1 = (yuyan * 2) + 1;
        System.out.println("Only " + yuyan+ "? I can speak "+yuyan1+ ", you uncultured swine.");
        
        
        
        
        
        
        
              
        
        
        
        
        
        
        
        
        
        
    }
    
}
