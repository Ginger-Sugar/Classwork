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
public class LovesMe {
    public static void main(String[] args) {

        int huaban = 34;  

        System.out.println("Should I leave? Or, should I stay?");
        boolean loveMe = true;

        while(huaban > 0) {
            
            if (loveMe) {
                System.out.println("\nThey love me!");
                huaban--;
                loveMe = false;
                
            }
            else {
                
                System.out.println("\tThey love me not!");
                huaban--;
                loveMe = true;
            }
                        
        } 
        System.out.println();
        System.out.println("Did you find the answer you were seeking?");
        }

    }


    

