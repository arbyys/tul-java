package cz.tul.alg.tue.arbys;

import java.util.Collections;
import java.util.Scanner;

public class Pozdrav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String evenSegment = "[__]";
        String oddSegment = "_][_";
        final int ONE_BRICK_LENGTH = 4;
        String output = "";

        System.out.println("Zadej počet cihel krbu - sudé číslo, min. 8: ");
        int bricks = sc.nextInt();
        bricks = Math.max(bricks, 8);
        if(bricks%2!=0)
        {
            bricks++;
        }

        System.out.println("Zadej frekvenci kouře - 1 až 10: ");
        int frequency = sc.nextInt();
        frequency = (frequency < 1) || (frequency > 10) ? 5 : frequency;

        int bricksInSlopes = (int) Math.ceil(bricks/ONE_BRICK_LENGTH);
        int spacesMiddle = (bricks-bricksInSlopes*2)*ONE_BRICK_LENGTH-2;

        output += String.format("%s.%s.\n", (String.join("", Collections.nCopies(bricksInSlopes+spacesMiddle, " "))), (String.join("", Collections.nCopies(ONE_BRICK_LENGTH, "_"))));
        for (int i = 0; i < 5; i++) {
            String currentVariable = (i%2==0 ? evenSegment : oddSegment);
            if(i == 4)
            {
                output += String.format("%s|%s|%s\n", (String.join("", Collections.nCopies(bricksInSlopes+spacesMiddle, "_"))), currentVariable, (String.join("", Collections.nCopies(((bricksInSlopes*ONE_BRICK_LENGTH)+ONE_BRICK_LENGTH), "_"))));
                continue;
            }
            output += String.format("%s|%s|\n", (String.join("", Collections.nCopies(bricksInSlopes+spacesMiddle, " "))), currentVariable);

        }

        for (int i = 0; i < 10; i++)
        {
            String currentVariable = (i%2==0 ? evenSegment : oddSegment);
            if(i >= 5)
            {
                String fireRow = i == 5 ? (String.join("", Collections.nCopies(spacesMiddle, " "))) : (i == 6 ? String.format(" %s ", (String.join("", Collections.nCopies((spacesMiddle-2)/2, "1 ")))) : String.format(" %s ", (String.join("", Collections.nCopies(spacesMiddle-2, "=")))));
                output += String.format("|%s|%s|%s|\n", (String.join("", Collections.nCopies(bricksInSlopes, currentVariable))), fireRow, (String.join("", Collections.nCopies(bricksInSlopes, currentVariable))));
                continue;
            }
            output += String.format("|%s|\n", (String.join("", Collections.nCopies(bricks, currentVariable))));
        }

        System.out.println(output);
    }
}
