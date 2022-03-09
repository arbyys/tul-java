import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Obrazek {
    public static String repeatString(int count, String s)
    {
        return String.join("", Collections.nCopies(count, s));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String evenSegment = "[__]";
        String oddSegment = "_][_";
        final int ONE_BRICK_LENGTH = 4;
        String output = "";

        System.out.println("Zadej počet cihel velmi horkého krbu - sudé číslo, min. 8: ");
        int bricks = sc.nextInt();
        bricks = Math.max(bricks, 8);
        if(bricks%2!=0)
        {
            bricks++;
        }

        System.out.println("Zadej frekvenci kouře velmi horkého krbu - 1 až 5: ");
        int frequency = sc.nextInt();
        frequency = (frequency < 1) || (frequency > 5) ? 3 : frequency;

        int bricksInSlopes = (int) Math.ceil(bricks/ONE_BRICK_LENGTH);
        int spacesMiddle = (bricks-bricksInSlopes*2)*ONE_BRICK_LENGTH-2;
        int bricksBeforeChimney = bricks/2 + r.nextInt(bricks-(bricks/2));

        for (int i = 0; i < 10; i++) {
            String smokeString = "";
            for (int j = 0; j < (6 + r.nextInt(4)); j++) {
                int randomNumber = (int)(Math.random()*100);
                if(randomNumber<= frequency*10)
                {
                    smokeString +="o";
                    continue;
                }
                smokeString+=" ";
            }
            output += String.format("%s%s\n", repeatString((bricksBeforeChimney*ONE_BRICK_LENGTH)-2, " "), smokeString);
        }

        output += String.format("%s.%s.\n", repeatString(bricksBeforeChimney*ONE_BRICK_LENGTH, " "), repeatString(ONE_BRICK_LENGTH, "_"));
        for (int i = 0; i < 5; i++) {
            String currentVariable = (i%2==0 ? evenSegment : oddSegment);
            if(i == 4)
            {
                output += String.format("%s|%s|%s\n", repeatString(bricksBeforeChimney*ONE_BRICK_LENGTH, "_"), currentVariable, repeatString(((bricks-bricksBeforeChimney-2)*ONE_BRICK_LENGTH)+ONE_BRICK_LENGTH, "_"));
                continue;
            }
            output += String.format("%s|%s|\n", repeatString(bricksBeforeChimney*ONE_BRICK_LENGTH, " "), currentVariable);

        }

        for (int i = 0; i < 10; i++)
        {
            String currentVariable = (i%2==0 ? evenSegment : oddSegment);
            if(i >= 5)
            {
                String fireRow = i == 5 ? (repeatString(spacesMiddle, " ")) : ((i == 6) ? (String.format(" %s ", repeatString((spacesMiddle-2)/2, "i "))) : (String.format(" %s ", repeatString(spacesMiddle-2, "="))));
                output += String.format("|%s|%s|%s|\n", repeatString(bricksInSlopes, currentVariable), fireRow, repeatString(bricksInSlopes, currentVariable));
                continue;
            }
            output += String.format("|%s|\n", repeatString(bricks, currentVariable));
        }

        System.out.println(output);
    }
}
