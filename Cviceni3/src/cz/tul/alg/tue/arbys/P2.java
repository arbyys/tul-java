package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Zadej první číslo: ");
        int a = sc.nextInt();
        System.out.format("Zadej druhé číslo: ");
        int b = sc.nextInt();

        if(a%b == 0)
        {
            System.out.println("První číslo je dělitelné druhým");
        }
        else
        {
            System.out.println("První číslo není dělitelné druhým");
        }
    }
}
