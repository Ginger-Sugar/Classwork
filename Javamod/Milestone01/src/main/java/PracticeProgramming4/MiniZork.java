/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming4;

import java.util.Scanner;

/**
 *
 * @author shana
 */
public class MiniZork {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String choice1;

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door. There's a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? Remember, you'll be able to return to the beginning at any point.");
        choice1 = myScanner.nextLine();

        if (choice1.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            choice1 = myScanner.nextLine();

            if (choice1.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                choice1 = myScanner.nextLine();

                if (choice1.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (choice1.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But your alive. Possibly a wise choice.");
                }

                //End of the first pathway 
            } else if (choice1.equals("stick your hand in")) {
                System.out.println("You stuck your hand in and what did you find?");
                System.out.println("A key with a number on it, 152");
                System.out.println("Do you go find the house with the matching number or leave the key where you found it?");
                choice1 = myScanner.nextLine();
            }

            if (choice1.equals("Leave the key")) {
                System.out.println("Smart choice. Good choice");
            } else if (choice1.equals("Go find the house")) {
                System.out.println("You walk down the block");
                System.out.println("All the porch lights in the neighborhood are off except for one. ");
                System.out.println("The house number matches the key.");
                System.out.println("Will you go up to the front door or walk away?");
                choice1 = myScanner.nextLine();

                if (choice1.equals("Walk away")) {
                    System.out.println("Good. You don't want to know what would have happened.");
                } else if (choice1.equals("Go up to the front door")) {
                    System.out.println("You walk up to the door and look inside.");
                    System.out.println("You don't see anyone inside.");
                    System.out.println("You knock, but there's no answer.");
                    System.out.println("Do you put the key in or walk away?");

                    choice1 = myScanner.nextLine();

                    if (choice1.equals("Walk Away")) {
                        System.out.println("Good, you just saved your life");
                    } else if (choice1.equals("Put the key in")) {
                        System.out.println("The key fits and you turn the knob");
                        System.out.println("You walk inside");
                        System.out.println("Unfortunately, you were shot, dummy. You're in the south.");
                    }

                    //End of 2nd pathway
                }
            }
            } else if (choice1.equals("go to the house")) {
                System.out.println("You walk up to the white house");
                System.out.println("You can hear a dog barking in the back");
                System.out.println("Do you go see the dog or knock on the door?");
                choice1 = myScanner.nextLine();

                if (choice1.equals("Go see the dog")) {
                    System.out.println("You go around the back and see a golden retriever.");
                    System.out.println("You spend the rest of your day petting it and taking selfies with the friendly dog.");
                } else if (choice1.equalsIgnoreCase("knock on the door")) {
                    System.out.println("You knock on the door and a small woman answers");
                    System.out.println("Do you strike up a conversation or make up an excuse and leave?");
                    choice1 = myScanner.nextLine();
                }
                if (choice1.equals("make up an excuse and leave")) {
                    System.out.println("You just avoided death. Good job!");
                } else if (choice1.equals("Strike up a conversation")) {
                    System.out.println("You strike up a conversation and she invites you in");
                    System.out.println("She offers you tea and you decline.");
                    System.out.println("She begins stirring hers.");
                    System.out.println("Sink");
                    System.out.println("Now, you're in the sunken place. Didn't you learn anything from Get Out");
                }
            }
        }
    }


