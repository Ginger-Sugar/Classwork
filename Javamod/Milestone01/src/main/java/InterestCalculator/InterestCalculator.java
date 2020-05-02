/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterestCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor
 */
public class InterestCalculator {
    public static void main(String[] args) {
        
        
        Scanner myScanner = new Scanner(System.in);
        
        double principal, aR, tP, interestEarned, compoundInterest;
        String iE, cI;
        
        System.out.println("How much are you wanting to invest?");
        principal = myScanner.nextInt();
        
        
        System.out.println();
        System.out.println("For how many years are you looking to invest for?");
        tP = myScanner.nextInt();
        
        System.out.println();
        System.out.println("What is the perspective interest rate?");
        aR = myScanner.nextDouble();
        
        System.out.println();
        System.out.println("Calculating: ");
        
        NumberFormat nf = NumberFormat.getNumberInstance(); //initialize the formating
        nf.setGroupingUsed(true); //sets comma every 3 numbers
        nf.setMaximumFractionDigits(2); //max of decimal digits (currency, always 2)
        nf.setMinimumFractionDigits(2);// minimum of decimal digits (currency, always 2)
        
        
        
        compoundInterest = principal * Math.pow((1 + aR/100), tP);
        interestEarned = (compoundInterest - principal);
        
        iE = nf.format(interestEarned);
        cI = nf.format(compoundInterest);
        System.out.println();
        System.out.println("The entered principal amount was: "+principal);
        System.out.println();
        System.out.println("The number of years: "+tP);
        System.out.println();
        System.out.println("The perspective interest rate: ");
  
        System.out.println("Your total amount after "+tP+" years is $ "+cI+" ." );
        System.out.println("Or $"+iE+ " in interest earned.");
        
    
    
    
    
    }
}
