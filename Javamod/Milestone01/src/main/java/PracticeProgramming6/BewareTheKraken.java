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
public class BewareTheKraken {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        String answer1;
        
         System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");

            
            if(depthDivedInFt == 10000){
                System.out.println("We've swum pretty deep, do you want to stop? (y/n");
                answer1 = myScanner.nextLine();
                
                    if(answer1.equals("y"))
                    {System.out.println("Okay! We'll return to the surface then.");
                    break;
                    }
                    else{
                        System.out.println("Okay! Let's keep going then!!");
                    }
            }
            
            
            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

       
            depthDivedInFt += 1000;
        }
        System.out.println();
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
  
