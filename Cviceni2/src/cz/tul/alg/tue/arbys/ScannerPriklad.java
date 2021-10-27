package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class ScannerPriklad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * next[datový typ]()
        * */
        System.out.println("Zadej slovíčko:\n> ");
        System.out.println(sc.next());
        System.out.println(sc.nextLine());
    }
}
