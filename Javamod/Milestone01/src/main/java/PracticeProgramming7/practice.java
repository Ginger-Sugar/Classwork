/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shana
 */
public class practice {
public static void n_random(int count, int finalSum)
{
    Random r = new Random();
    int numbers[] = new int[count];
    int sum = 0;
    for (int i = 0; i < count - 1; i++)
    {
        numbers[i] = r.nextInt((finalSum - sum) / 2) + 1;
        sum += numbers[i];
    }
    numbers[count - 1] = finalSum - sum;

    StringBuilder numbersString = new StringBuilder("Random number list: ");
    for (int i = 0; i < count; i++)
        numbersString.append(numbers[i] + " ");
    System.out.println(numbersString);
}

public static void main(String[] args)
{
    n_random(9, 250);
}
}
