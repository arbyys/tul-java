package cz.tul.alg.tue.arbys;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P7AverageTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int temperatureTimes[] = {6, 12, 18};
        double sum = 0d;

        for (int i = 0; i < temperatureTimes.length; i++) {
            System.out.format("\n Zadej teplot v %d hodin: ", temperatureTimes[i]);
            double input = sc.nextDouble();

            sum += input;
            if(temperatureTimes[i] == 18)
            {
                sum += input;
            }
        }

        double average = sum / temperatureTimes.length + 1;
        System.out.format("Průměr teplot ve dne je: %s", average);
    }
}
