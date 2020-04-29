/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shana
 */
public class FortuneCookie {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int x;
        
        System.out.println("Choose a number from 0-11 to recieve your fortune");
        x= myScanner.nextInt();
        
         switch (x) {
            case 0:
                System.out.println("By three methods we may learn wisdom: First, by reflection, which is noblest; Second, "
                        + "by imitation, which is easiest; and third by experience, which is the bitterest.");
                break;
            case 1:
                System.out.println("Wheresoever you go, go with all your heart.");
                break;
            case 2:
                System.out.println("He who knows all the answers has not been asked all the questions.");
                break;
            case 3:
                System.out.println("The man who moves a mountain begins by carrying away small stones.");
                break;
            case 4:
                System.out.println("To be wronged is nothing, unless you continue to remember it.");
                break;
            case 5:
                System.out.println("The man who asks a question is a fool for a minute, the man who does not ask is a fool for life.");
                break;
                
            case 6:
                System.out.println("When you see a good person, think of becoming like them. When you see someone not so good,"
                        + " reflect on your own weak points.");
                break;
            case 7:
                System.out.println("What the superior man seeks is in himself; what the small man seeks is in others.");
                break;
            case 8:
                System.out.println("Attack the evil that is within yourself, rather than attacking the evil that is in others.");
                break;
            case 9:
                System.out.println("Give a bowl of rice to a man and you will feed him for a day. Teach him how to grow his own "
                        + "rice and you will save his life.");
                break;
            case 10:
                System.out.println("The gem cannot be polished without friction, nor man perfected without trials.");
                break;
            case 11:
                System.out.println("When it is obvious that the goals cannot be reached, don't adjust the goals, adjust the action steps.");
                break;
        
        }
        
        System.out.println(" - Confucius");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
