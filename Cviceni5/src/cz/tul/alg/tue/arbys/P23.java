package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int divisor = 2;
            String result = "";

            //System.out.println("\nZadej číslo, u kterého se má provést rozklad na součin prvočísel. Zadej 0 nebo záporné číslo pro ukončení. \n>");
            //num = sc.nextInt();
            num = 123456;
            if (num <= 0) {
                break;
            }

            while (divisor <= num) {
                if (num % divisor != 0) {
                    divisor++;
                    continue;
                }
                num /= divisor;
                result += String.format("%s * ", divisor);
            }
            System.out.println(result.substring(0, result.length() - 2));
            break;
        }
    }
}
