import java.time.LocalTime;
import java.util.Scanner;

public class PrevodSekund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.ofSecondOfDay(sc.nextInt());
        System.out.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
    }
}
