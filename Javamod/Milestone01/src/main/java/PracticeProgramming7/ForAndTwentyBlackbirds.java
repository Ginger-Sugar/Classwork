/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

/**
 *
 * @author shana
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        
       int birdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
    
//you had to increase 20 to 24
