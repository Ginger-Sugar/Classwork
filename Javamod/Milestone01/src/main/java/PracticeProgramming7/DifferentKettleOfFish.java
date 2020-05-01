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
public class DifferentKettleOfFish {
    public static void main(String[] args) {

    int i=1;
    
    for(i = 1; i < 11; i++){
        switch (i) {
            case 3:
                System.out.println("RED Fish!!");
                break;
            case 4:
                System.out.println("BLUE fish!!!");
                break;
            default:
                System.out.println(i+ " fish!");
                break;
        }
    }
    }
    
}
