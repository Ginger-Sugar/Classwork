/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lucky7s;

import java.util.Random;
import java.util.Scanner;



// alt+ shift + f to auto format code
//when you start a set of curly braces, press enter. It will auto complete the ending of it.
/**
 *
 * @author Shantoria Taylor
 */
public class Lucky7s {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int firstBet;

        System.out.println("Okay! Time to play Lucky 7s!!");
        System.out.println();
        System.out.println();

        System.out.println("Please enter your initial bet.");
        firstBet = myScanner.nextInt();

        int money = firstBet;
        int totalRoll = 0;
        int highestWon = 0;
        int rollCountHighestWon = 0;

        while (money > 0) {
            int dice1 = rollDice();
           

            if ((dice1) == 7) {
                money = money + 4;
            } 
            else {
                money = money - 1;
            }

            if (highestWon < money) {
                highestWon = money;
                rollCountHighestWon = totalRoll + 1;
            }
            totalRoll++;
        }
        System.out.println(" The highest amount you earned was $"+highestWon);
        System.out.println("It took you "+rollCountHighestWon+" rolls to get to $"+highestWon);
    }

    /**
     *
     * @return
     */
    public static int rollDice() {
        Random rando = new Random();

        int dice1 = rando.nextInt(6 - 1) + 1;
        int dice2 = rando.nextInt(6 - 1) + 1;
        int totalRoll = dice1 + dice2;

        return totalRoll;
    }//end of  class
   
}
