package cz.tul.tue.alg.arbys;

import java.util.Scanner;

public class GuessingGame1 {
    static Scanner sc = new Scanner(System.in);
    static int min = 0;
    static int max = 100;

    public static void main(String[] args) {
        displayMenu();
        boolean end = false;

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                Variants.userGuesses();
                break;
            case 2:
                Variants.computerGuesses();
                break;
            case 0:
                end = true;
                break;
            default:
                System.out.println("Neplatná volba");
        }
    }

    private static void displayMenu() {
        System.out.println("1 = hádá uživatel\n");
    }

}
