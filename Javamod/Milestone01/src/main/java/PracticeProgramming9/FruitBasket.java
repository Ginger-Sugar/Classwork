/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming9;

/**
 *
 * @author shana
 */
public class FruitBasket {
    public static void main(String[] args) {
        
               String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        int i =0;
        
        for (i =0; i < fruitBasket.length; i++) {
            
            if(fruitBasket[i].equals("Orange")){
                numOranges++;
                        }
            else if(fruitBasket[i].equals("Apple")) {
                numApples++;
                        }
            else{
                numOtherFruit++;
                        }
        }
            System.out.println("Okay! So, how many fruit do we have?");
            System.out.println();
            System.out.println("We have " +numOranges+ " oranges. ");
            System.out.println("Next, we have " +numApples+ " apples. ");
            System.out.println("Finally, we have " +numOtherFruit+ " other fruits that are neither oranges nor apples.. ");
    }
}
        

