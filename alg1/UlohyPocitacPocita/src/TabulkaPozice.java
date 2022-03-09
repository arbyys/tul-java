import java.util.Scanner;

public class TabulkaPozice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] instructions = sc.nextLine().trim().split("\\s+");

        int cols = Integer.parseInt(instructions[1]);
        int element = Integer.parseInt(instructions[2]);

        int elementCol = element%cols == 0 ? cols : element%cols;
        int elementRow = 1;
        for (int i = 1; i < element; i++) {
            if(i % cols == 0)
            {
                elementRow++;
            }
        }
        System.out.format("%s %s", elementRow, elementCol);
    }
}
