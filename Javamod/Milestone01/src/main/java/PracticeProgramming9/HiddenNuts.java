/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming9;

import java.util.Random;

/**
 *
 * @author Shantoria Taylor
 */


public class HiddenNuts {
    public static void main(String[] args) {

        
        String[] hidingSpots = new String[100];
        
        Random squirrel = new Random();
        
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        
        System.out.println("Oh no! The nut has been hidden and I don't know where it is...");
        System.out.println("Can you help me find it??");
        int i;
     for(i=0;i<hidingSpots.length;i++){
         if(hidingSpots[i] ==("Nut")){
             System.out.println();
             System.out.println("I found it! I found it! The nut is at spot "+i);
         }
     }
        
    }
    
}
