package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej číslo: ");
        double number = scanner.nextDouble();
        System.out.println("Zadej celočíselnou mocninu: ");
        int power = scanner.nextInt();
        double result = 1;

        if(number == 0 && power == 0)
        {
            throw new Exception("Not defined ");
        }

        boolean isNegative = power < 0;
        if(isNegative)
        {
            power *= -1;
        }
        for (int x = 1; x <= power; x++)
        {
            result = result * number;
        }
        if(isNegative)
        {
            result = 1/result;
            power *= -1;
        }

        System.out.format("%s na %s je %s", number, power, result);
    }
}
