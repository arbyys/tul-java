package cz.tul.alg.tue.arbys;

import java.util.Scanner;

import static java.lang.Math.abs;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Zadej délku strany A: ");
        int a = sc.nextInt();
        System.out.format("Zadej délku strany B: ");
        int b = sc.nextInt();
        System.out.format("Zadej délku strany C: ");
        int c = sc.nextInt();

        boolean canConstruct = (a + b > c) && (abs(a - b) < c);

        if(canConstruct)
        {
            System.out.println("Trojúhelník lze sestavit");
        }
        else
        {
            System.out.println("Trojúhelník nelze sestavit");
        }
    }

}
