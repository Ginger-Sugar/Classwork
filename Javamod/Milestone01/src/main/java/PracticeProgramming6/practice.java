/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Random;

/**
 *
 * @author shana
 */
public class practice {
    public static void main(String[] args) {
        Random randomize = new Random();
        int timesAsked = 1;
        
        boolean roomIsClean = false;
        
        do{
            System.out.print("\nClean your room!! (x" + timesAsked + ")");
            
            int chance = randomize.nextInt(10) + 1;
            
            if (chance <= timesAsked){
                roomIsClean = true;
                System.out.println("\nFINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            } else if (timesAsked == 7){
                System.out.println("\nThat's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            timesAsked++;
        } while(!roomIsClean);
    }


}
