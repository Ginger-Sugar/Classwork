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
public class AllTheTrivia {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String pm, color, tn, capital;
        
        
        System.out.println("Who is the Prime Minister of Finland?");
        pm = myScanner.nextLine();
        //Sanna Marin
        
        System.out.println();
        System.out.println("What are the colors of the Nigerian flag?");
        color = myScanner.nextLine();
        //green and white
        
        System.out.println();
        System.out.println("What is Tennessee's nickname? Why?");
        tn = myScanner.nextLine();
        //Volunteer State. War of 1812
        
        System.out.println();
        System.out.println("What's the capital of Malaysia?");
        capital = myScanner.next();
        //Kuala Lumpur
        
        System.out.println("Can you believe that Sanna Marin is the capital of the Volunteer State!?!");
        System.out.println("Green and white are the official nickname of Kuala Lumpur!!");
        
    }
}
