package cz.tul.alg.tue.arbys;

public class P2SecToTime {
    public static void main(String[] args) {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;

        int input = 3600;
        int hours = input / 3600;
        int minutes = (input / 60) % 60;
        int seconds = input % 60;

        System.out.println(String.format("Celkový čas - %02d:%02d:%02d", hours, minutes, seconds));
    }
}
