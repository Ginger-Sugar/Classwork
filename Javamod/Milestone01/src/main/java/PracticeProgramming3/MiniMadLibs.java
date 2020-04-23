/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming3;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner(System.in);
    
    String noun, noun1, adj, adj1, pNoun, pNoun1, pNoun2, vPT, pastVPT;
    int num1;
        

        System.out.println("Let's play MAD LIBS");
        
        System.out.println();
        System.out.println();
        System.out.println("I need a noun.");
        noun = myScanner.nextLine();
        
        
        System.out.println("Now an adjective");
        adj = myScanner.nextLine();
        
        System.out.println();
        System.out.println("Another noun");
        noun1 = myScanner.nextLine();
        
        
        System.out.println();
        System.out.println("And a number");
        num1 = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Another adjective");
        adj1 = myScanner.nextLine();
        
        System.out.println();
        System.out.println("A plural noun");
        pNoun = myScanner.nextLine();
        
        System.out.println();
        System.out.println("Another one");
        pNoun1 = myScanner.nextLine();
        
        System.out.println();
        System.out.println("One more");
        pNoun2 = myScanner.nextLine();
        
        System.out.println();
        System.out.println("A verb");
        vPT = myScanner.nextLine();
        
        System.out.println();
        System.out.println("Same ver, but make it past tense");
        pastVPT = myScanner.nextLine();
        
        
        System.out.println(noun+" : the" +adj+ " frontier. These are the voyages of the starship " +noun1+ " . Its " +num1+ " -year mission: to explore strange "+adj1+ " "+pNoun+ " , to seek out "+adj1+" " +pNoun1+ " and" +adj1+" "+pNoun2+ " , to boldly " +vPT+ " where no one has "+pastVPT+ " before.");

        
        
        
        
    }
    
}
