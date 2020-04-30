/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class RollerCoaster {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("We're going to go on a roller coaster.....");
        System.out.println("Let me know when you want to get off........!");
        
        String kR = "y";
        int lL = 0;
        
        if(kR.equals(" ")) {
            System.out.println("You did not enter y or n.");
            
            return;
        }
        
        while(kR.equals("y")){
            System.out.println("WHEEEEEEEEEEEEEEEEEE!!!");
        System.out.println("Want to keep going? (y/n :");
        
            kR= myScanner.nextLine();
            lL++;
                    }
        
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " +lL+ " times.");
       
    }
    
}
//if it's not y/n it will still end the program as it's only programmed to respond to 
//the letter y

//You can just write an if statement to check to see if the input was blank.
//If it is blank, then you simply reset.