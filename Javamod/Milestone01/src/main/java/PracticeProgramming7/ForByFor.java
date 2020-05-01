/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

/**
 *
 * @author Shantoria Taylor
 */
public class ForByFor {
    public static void main(String[] args) {
        int j, k, i;
        for ( i = 0; i < 3; i++) {
            System.out.print("|");

            for ( j = 0; j < 3; j++) {
                for ( k = 0; k < 3; k++) {
                    
                    if ((i == 0 || i == 2) && (j == 1)){
                        System.out.print("$");
                    } 
                    else if (i == 1 && (j == 0 || j == 2)){
                        System.out.print("@");
                    } 
                    else if(i == 1 && j == 1){
                        System.out.print("#");
                    } 
                    else{
                        System.out.print("*");
                    }
                }
                    System.out.print("*");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    

