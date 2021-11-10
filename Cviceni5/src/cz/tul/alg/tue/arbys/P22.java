package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        int prime;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            boolean isPrime = true;
            int divisor = 2;

            System.out.println("\nZadej číslo, u kterého se má zjistit, zda je prvočíslo. Zadej 0 pro ukončení. \n>");
            prime = sc.nextInt();
            if(prime == 0)
            {
                break;
            }

            while(isPrime && (divisor <= prime/2))
            {
                isPrime = prime%divisor != 0;
                divisor++;
            }
            System.out.format("%s %s prvočíslo.", prime, isPrime ? "je" : "není");
        }

    }
}
