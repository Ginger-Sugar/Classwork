/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming4;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class PickyEater {
    public static void main(String[] args) {
        
        
        Scanner myScanner =  new Scanner(System.in);  
        
        int butterPats, fried;
        String spinach, funnyName,  chocolate, broccoli, cheese;
        
        System.out.println("Just how picky is your child?? Take the quiz to find out!!");
        
        
        System.out.println();
        System.out.println("Is there spinach in the food?  (y/n)");
        spinach = myScanner.nextLine();
        
        
        System.out.println();
        System.out.println("Does it have a funny name? (y/n)");
        funnyName = myScanner.nextLine();
        
        System.out.println();
        System.out.println("How many times has it been fried?");
        fried = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Is it covered in chocolate? (y/n)");
        chocolate = myScanner.nextLine();
        
        System.out.println();
        System.out.println("Is it covered in cheese? (y/n)");
        cheese = myScanner.nextLine();
        
        System.out.println();
        System.out.println("How many pats of butter does the food have?");
        butterPats = myScanner.nextInt();
        
        System.out.println();
        System.out.println("Is it broccoli?");
        broccoli = myScanner.nextLine();
        if (spinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        
        }
        if(fried == 3 && chocolate.equals("y")  ) {
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        
        if(fried == 2 && cheese.equals("y")) {
            System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");
        }
        
        if (broccoli.equals("y") && butterPats > 6 && cheese.equals("y")) {
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        }
        else{
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
        
        
        
    }
    
}
