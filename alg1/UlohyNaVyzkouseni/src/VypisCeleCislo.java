import java.util.Scanner;

public class VypisCeleCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String sign = number < 0 ? "-" : "+";
        System.out.format(sign + "%03d", Math.abs(number));
    }
}
