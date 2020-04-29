/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming5;

import java.util.Random;

/**
 *
 * @author shana
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        Random rando = new Random();
        
        boolean x;
        
        x=rando.nextBoolean();
        
        if(x == true){
            System.out.println("Boooo, you loser. You got tails");
            
        } 
        else {
            System.out.println("Go Glen Coco! You got heads!!");
        }
        
        
    }
    
}
