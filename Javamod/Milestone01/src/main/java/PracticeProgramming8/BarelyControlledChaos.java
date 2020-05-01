/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming8;

import java.util.Random;

/**
 *
 * @author shana
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color1 = cuteColor(); 
        String animal = friendlyAnimals(); 
        String color2 = cuteColor(); 
        
        int weight = randoNum(5, 200); 
          
        int distance = randoNum(10, 20); 
           
        int number = randoNum(10000, 20000); 
        
        int time = randoNum(2, 6); 
                

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color1 + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + color2 + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
public static String cuteColor(){
    
        Random rando = new Random();
        int color = rando.nextInt(5);
        
        switch (color){
            case 0: return "lemon";
            case 1: return "neon pink";
            case 2: return "mint green";
            case 3: return "teal";
            default: return "steel grey";
        }
    }
    
    public static String friendlyAnimals(){
        Random rando = new Random();
        int animal = rando.nextInt(5);
        
        switch (animal){
            case 0: return "seal";
            case 1: return "dog";
            case 2: return "butterfly";
            case 3: return "ant";
            default: return "Liger";
        }
    }
    
    public static int randoNum(int min, int max){
        Random rando = new Random();
        return (rando.nextInt(max - min) + min + 1);
    }

    private static String cuteAnimals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
    

