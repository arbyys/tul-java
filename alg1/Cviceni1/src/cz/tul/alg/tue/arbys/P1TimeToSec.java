package cz.tul.alg.tue.arbys;

public class P1TimeToSec {
    public static void main(String[] args) {
        int hours = 10;
        int minutes = 5;
        int seconds = 10;
        int result = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Celkem sekund: " + result);
    }
}
