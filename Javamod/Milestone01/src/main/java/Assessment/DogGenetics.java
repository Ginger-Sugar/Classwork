/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class DogGenetics {

    public static void main(String[] args) {

        String dogName;
        

       // n_random(5, 100);

        String[] stringArr = new String[]{"German Shepard", "Bulldog", "Poodle", "Labrador", "Great Dane"};
        System.out.println("Hello, what's your dogs name?");
        Scanner myScanner = new Scanner(System.in);
        dogName = myScanner.nextLine();

        System.out.println();
        System.out.println("Well then, I have this highly reliable report on " + dogName + " 's prestigious background right here.");

        System.out.println();
        System.out.println();
        System.out.println(dogName + " is: ");

        
        int count = 5, finalSum = 100;
        Random rando = new Random();
        int numbers[] = new int[count];
        int sum = 0;

        for (int i = 0; i < count - 1; i++) {

            numbers[i] = rando.nextInt((finalSum - sum) / 2) + 1;
            sum += numbers[i];
        }
        numbers[count - 1] = finalSum - sum;
        
        

        System.out.println();
        System.out.println(numbers[0] + "% " + stringArr[0]);
        System.out.println(numbers[1] + "% " + stringArr[1]);
        System.out.println(numbers[2] + "% " + stringArr[2]);
        System.out.println(numbers[3] + "% " + stringArr[3]);
        System.out.println(numbers[4] + "% " + stringArr[4]);

        System.out.println();
        System.out.println();
        System.out.println("Wow! That's quite a dog!");

        

    }

}
