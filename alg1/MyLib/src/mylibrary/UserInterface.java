package mylibrary;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo: ");
        int number = sc.nextInt();
        boolean isPrime = NumberTools.isPrime(number);
        System.out.println(NumberTools.isPrime(13));
        System.out.format("Číslo %s %s prvočíslo", number, isPrime ? "je" : "není");
    }
}
