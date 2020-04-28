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
public class YourLifeInMovies {
    
    public static void main(String[] args) {
        
        
        Scanner myScanner = new Scanner(System.in);
        
        int bYear;
        
        String userName;
        
        System.out.println("Hey there! What's your name?");
            userName = myScanner.nextLine();
            
        System.out.println(userName+", what year were you born?");
        bYear = myScanner.nextInt();
        
        if( bYear < 2005) {
            System.out.println("Did you know that Up came out over a decade ago??");
        }
        
        if(bYear < 1995){
            System.out.println("Did you know that the Harry Potter and Philospher's Stone movie turns twenty next year??");
        }
        
        if(bYear < 1985){
            System.out.println("Or, do you remember watching Space Jams as a kid? Guess what, Space Jams is older than Camila Cabello, Simone Biles and Kylie Jenner.");
        }
        
        if(bYear < 1975){
            System.out.println("Did you know, Jurassic Park was released closer to Neil Armstrong walking on the moon than it was to now");
        }
        
        if(bYear < 1965){
            System.out.println("Congrats!! You've lived 5 years of your life not at war. ('76-'78, 1997, 2000)");
          
        }
        
        System.out.println("Do you feel old yet?");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
