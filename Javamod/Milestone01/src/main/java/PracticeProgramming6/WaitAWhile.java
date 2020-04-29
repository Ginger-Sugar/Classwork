/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

/**
 *
 * @author Shantoria Taylor
 */
public class WaitAWhile {
    public static void main(String[] args) {
        
       int timeNow = 5;
       int bedTime = 10;
       
       
       while(timeNow < bedTime) {
           
           System.out.println("It's only " +timeNow+ " o'clock!");
           System.out.println("I think I'll stay up just a littttlleee longer........");
           timeNow++;
       }
        
        System.out.println("Oh. It's "+timeNow+ " o'clock.");
        System.out.println("Guess I should go to bed............");
        
        
    }
    
}
//If you change the bedTime value to 11, you will have one additional iteration 
//of the "It's only...." 

//I would think it would depend on if the system uses the 24 hour or 12 hour clock.
//If  it's 12 hours, then the time should just start from 11 and then go to 10. 

//if you comment out timeNow++, the hour won't increase, thereby making the code ineffective. 