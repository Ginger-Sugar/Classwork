/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Random;

/**
 *
 * @author Shantoria Taylor
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
        Random random = new Random();

        int huaban;
        
        huaban = new Random().nextInt((89 - 13) + 1) + 13;

        System.out.println("Should I leave? Or, should I stay?");
        boolean loveMeYouWhore = true;

        while(huaban > 0) {
            
            if (loveMeYouWhore) {
                System.out.println("\nThey love me!");
                huaban--;
                loveMeYouWhore= false;
                
            }
            else {
                
                System.out.println("\tThey love me not!");
                huaban--;
                loveMeYouWhore = true;
            }
            
        }
                      if(loveMeYouWhore)  {
                          System.out.println();
                          System.out.println("Awwww, bummer.");
        } 
                      else{
                          System.out.println();
                          System.out.println("Oh, wow! They love me. They really really LOVE me!");
                      }
        System.out.println();
        System.out.println("Did you find the answer you were seeking?");
        }

    
    }

   


    

