import java.util.Scanner;

public class TabulkaPoradi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] instructions = sc.nextLine().trim().split("\\s+");

        int rows = Integer.parseInt(instructions[0]);
        int cols = Integer.parseInt(instructions[1]);
        int elementRow = Integer.parseInt(instructions[2]);
        int elementCol = Integer.parseInt(instructions[3]);

        int currentRow = 1;
        int currentCol = 1;
        int currentElement = 1;
        for (int i = 1; i <= rows*cols; i++)
        {
            currentCol = i%cols == 0 ? cols : i%cols;
            if((currentCol == elementCol) && (currentRow == elementRow))
            {
                break;
            }
            currentElement += 1;
            if(i % cols == 0)
            {
                currentRow++;
            }
        }
        System.out.println(currentElement);
    }
}