/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming3;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int age, maxHR, targetMin, targetMax;
        
        System.out.println("Hello!! How old are you?");
        age = myScanner.nextInt();
        
        maxHR = 220 - age;
        
        targetMin = (int) (maxHR * .5);
        
        targetMax = (int) (maxHR * .85);
                
                
        System.out.println("Your maximum heart rate during exercise should be "+maxHR+" .");
        
        System.out.println();
        System.out.println("Your target heart rate during exercise should be "+targetMin+" , the maximum "+targetMax+" .");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
