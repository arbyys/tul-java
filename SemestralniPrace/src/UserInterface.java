import java.util.Scanner;

/**
 * 1. Program generates matrix in spiral shape filled with incrementing numbers
 * @author adapet
 * @version 0.001 10/01/22
 */
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("====================\n1 = semestrální práce\n2 = vánoční úloha\n3 = konec\n\nZadej číslo:\n");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                SemestralniPrace.main(null);
            }
            else if(choice == 2)
            {
                VanocniUloha.main(null);
            }
            else
            {
                break;
            }
        }

    }
}
