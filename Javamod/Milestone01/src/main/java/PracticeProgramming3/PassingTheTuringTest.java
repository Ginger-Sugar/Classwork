/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming3;


/**
 *
 * @author shana
 */

import java.util.Scanner;

public class PassingTheTuringTest {
    
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        
        String name, color, favoriteFruit;
        
        int favoriteNum;
        
        System.out.println("Hello!");
        System.out.println("Why hello, there! What's your name?");
        name = myScanner.nextLine();
        
        
        System.out.println("");
        System.out.println("Hello, dear " +name+ "!! My name is Sinclair!");
        
        System.out.println("So, " + name+ ", what's you're favorite color?");
        color = myScanner.nextLine();
        
        System.out.println();
        System.out.println("Oh, " +color+"!! That's really cool. My favorite is mint cream.");
        
        
        System.out.println("It's funny though, I actually love mint tea with a bit of cream.");
        System.out.println("While we're talking about favorites, what's your fave number?");
        favoriteNum = Integer.parseInt(myScanner.nextLine());
        
        System.out.println(favoriteNum +" is such a cool number. For some reason, I really like the number 3. lol");
        System.out.println("Did you know that " +favoriteNum+ " times 3 is "+ (favoriteNum * 3) + " ?? That's a pretty cool number too!");
        System.out.println("");
        
        System.out.println("Well, it was super chill talking to you, but I gotta go. TTYL!!");
        
        
    }   
    
}
