package cz.tul.alg.tue.arbys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

public class P9AverageVehicleSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.format("Zadej maximální povolenou rychlost v daném úseku [km/h]: ");
        int maximalSpeed = sc.nextInt();

        System.out.format("Zadej délku úseku [m]: ");
        double sectionLength = sc.nextDouble();

        System.out.format("Zadej čas průjezdu startem [hh:mm:ss.SSS]: ");
        String startTime = sc.next();

        System.out.format("Zadej čas průjezdu cílem [hh:mm:ss.SSS]: ");
        String endTime = sc.next();

        Date startDateTime = null;
        Date endDateTime = null;

        try
        {
            startDateTime = new SimpleDateFormat("HH:mm:ss.SSS").parse(startTime);
            endDateTime = new SimpleDateFormat("HH:mm:ss.SSS").parse(endTime);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        long diff = endDateTime.getHours() - startDateTime.getHours();

        System.out.println(diff);


    }
}
