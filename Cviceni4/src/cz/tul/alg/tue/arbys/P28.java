package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej celé kladné číslo: ");
        long number = Math.abs(scanner.nextLong());

        long sum = 0;
        for(long current = 1; current <= (number/2); current++)
        {
            sum += (number%current == 0 ? current : 0);
        }
        boolean isPerfect = sum == number;
        System.out.format("Číslo %s %s dokonalé.", number, isPerfect ? "je" : "není");
    }
}
