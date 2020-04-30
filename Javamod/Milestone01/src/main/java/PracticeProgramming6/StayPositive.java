/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming6;

import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class StayPositive {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int firstNum, i=0;
        
        System.out.println("What number should I count down from?");
        firstNum = myScanner.nextInt();
        
        System.out.println("Let's start the countdown!!");
        
        while(firstNum>= 0) {
        if(firstNum<0){
            System.out.println("We're trying to stay positive! Please don't enter a negative. ");
           
        }
        
        if (i % 10 == 0) {
                System.out.print("\n" + firstNum + " ");
                firstNum--;
                i++;
            }else{
                System.out.print(firstNum+ " ");
                firstNum--;
                i++;
            }
        }
        System.out.println();
            System.out.println("Looks like we made it to zero!!");
    }
}
