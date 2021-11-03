package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej celé kladné číslo: ");
        String num = scanner.nextLine();
        int sum = 0;
        int helper = 0;
        boolean valid = false;

        for(int i = 0; i < 7; i++)
        {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum += number * (i+8-helper);
            helper += 2;
        }
        int modulo = sum % 11;
        int lastDigit = Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));

        if(modulo == 0 && lastDigit == 1)
        {
            valid = true;
        }
        else if (modulo == 1 && lastDigit == 0)
        {
            valid = true;
        }
        else
        {
            if(lastDigit == 11-modulo)
            {
                valid = true;
            }
        }

        System.out.println(valid);
    }
}
