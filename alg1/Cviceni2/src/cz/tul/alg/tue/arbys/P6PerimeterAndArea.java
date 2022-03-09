package cz.tul.alg.tue.arbys;

import java.util.Scanner;

public class P6PerimeterAndArea {
    public static void main(String[] args) {
        System.out.println("Poloměr:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.format("Obvod: %s, obsah: %s", perimeter, area);
    }
}
