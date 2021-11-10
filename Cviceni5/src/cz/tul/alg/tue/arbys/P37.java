package cz.tul.alg.tue.arbys;

import java.util.Collections;
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej výšku vlajky: ");
        int height = sc.nextInt();

        height += height % 2 == 0 ? 1 : 0;
        int width = height / 2 * 3;

        int middleLane = height/2+1;
        boolean aboveMiddle = true;
        int currentTriangleNumber = 0;

        for(int row = 1; row <= height; row++)
        {
            String currentSymbol = aboveMiddle ? " + " : " - ";
            currentTriangleNumber += aboveMiddle ? 1 : -1;

            if(row == middleLane)
            {
                System.out.println(String.join("", Collections.nCopies(width, " @ ")));
                aboveMiddle = false;
            }
            else
            {
                System.out.println(
                        String.join("", Collections.nCopies(currentTriangleNumber, " @ ")) +
                        String.join("", Collections.nCopies(width-currentTriangleNumber, currentSymbol))
                );
            }
        }
    }
}
