package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int previous = Integer.MAX_VALUE;
        boolean sorted = true;

        while((number = sc.nextInt()) > 0)
        {
            if(previous >= number)
            {
                sorted = false;
            }
            previous = number;
        }
    }
}
