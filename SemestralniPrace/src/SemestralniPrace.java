import java.util.Arrays;
import java.util.Scanner;

public class SemestralniPrace
{
    /**
     * Determines if entered matrix position is outside the matrix or not
     * @param rowPosition number row position
     * @param colPosition number column position
     * @param rows number total number of rows
     * @param cols number total number of cols
     * @return boolean if position is outside matrix or not
     */
    public static boolean isOutOfBounds(int rowPosition, int colPosition, int rows, int cols)
    {
        return (0 > rowPosition || rowPosition >= rows) || (0 > colPosition || colPosition >= cols);
    }

    /**
     * Determines if entered position is already occupied with another number (unoccupied positions have value 0)
     * @param rowPosition number row position
     * @param colPosition number column position
     * @param grid int2DArray given matrix
     * @return boolean if position is occupied
     */
    public static boolean isAlreadyOccupied(int rowPosition, int colPosition, int[][] grid)
    {
        return grid[rowPosition][colPosition] != 0;
    }

    /**
     * Generates new row and col position based of direction to move in
     * @param rowPosition number row position
     * @param colPosition number column position
     * @param direction string given direction (right/down/left/up)
     * @return intArray modified entered values rowPosition and colPosition
     */
    public static int[] movePosition(int rowPosition, int colPosition, String direction)
    {
        int[] values = new int[]{rowPosition, colPosition};
        switch(direction)
        {
            case "right":
                values[1] += 1;
                break;
            case "left":
                values[1] -= 1;
                break;
            case "up":
                values[0] -= 1;
                break;
            case "down":
                values[0] += 1;
                break;
        }
        return values;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int rows, cols;
        int newRowPosition;
        int newColPosition;
        int[] returnedValues;

        while(true)
        {
            System.out.println("Pocet radku:");
            rows = sc.nextInt();
            if(rows <= 0)
            {
                break;
            }

            System.out.println("Pocet sloupcu:");
            cols = sc.nextInt();
            if(cols <= 0)
            {
                break;
            }

            int[][] matrix  = new int[rows][cols];
            String[] directions = new String[]{"right", "down", "left", "up"};
            String currentDirection = "right";
            int currentRowPosition = 0;
            int currentColPosition = 0;

            /* zkouška metod:

                System.out.println(isOutOfBounds(10, 5, rows, cols));
                System.out.println(isAlreadyOccupied(10, 5, matrix));
                System.out.println(movePosition(currentRowPosition, currentColPosition, currentDirection));
             */

            for (int iterator = 1; iterator <= rows*cols; iterator++)
            {
                matrix[currentRowPosition][currentColPosition] = iterator;
                returnedValues = movePosition(currentRowPosition, currentColPosition, currentDirection);
                newRowPosition = returnedValues[0];
                newColPosition = returnedValues[1];

                if(isOutOfBounds(newRowPosition, newColPosition, rows, cols) || isAlreadyOccupied(newRowPosition, newColPosition, matrix))
                {
                    int currentIndex = Arrays.asList(directions).indexOf(currentDirection);
                    currentDirection = directions[currentIndex == directions.length-1 ? 0 : currentIndex+1];
                    returnedValues = movePosition(currentRowPosition, currentColPosition, currentDirection);
                }
                currentRowPosition = returnedValues[0];
                currentColPosition = returnedValues[1];
            }
            for (int[] row : matrix)
            {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }
}
