import java.util.Locale;
import java.util.Scanner;

public class VypisRealneCislo {
    public static void main(String[] args) {
        Locale loc = new Locale("CS", "cz");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(loc);

        double cislo = sc.nextDouble();
        System.out.format(loc, "%10.3f", cislo);
    }
}
