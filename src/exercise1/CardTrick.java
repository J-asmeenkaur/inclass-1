package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        int[] handValues = new int[7];
        int[] handSuits = new int[7];

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            handValues[i] = random.nextInt(13) + 1; 
            handSuits[i] = random.nextInt(4);       
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1-13):");
        int value = scanner.nextInt();
        System.out.println("Pick a card suit (1-4):");
        int suit = scanner.nextInt() - 1; 

        boolean found = false;
        for (int i = 0; i < 7; i++) {
            if (handValues[i] == value && handSuits[i] == suit) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is [Your Name].");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();
        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");
        System.out.println();
    }
}
