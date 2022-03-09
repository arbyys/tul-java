import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String[] temperatures = sc.nextLine().trim().split("\\s+");

        float temp6 = Float.parseFloat(temperatures[0]);
        float temp12 = Float.parseFloat(temperatures[1]);
        float temp18 = Float.parseFloat(temperatures[2]);

        float average = (temp6 + temp12 + temp18*2) / 4;
        System.out.format(Locale.US, "%1.2f", average);
    }
}
