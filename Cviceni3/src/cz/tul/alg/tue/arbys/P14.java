package cz.tul.alg.tue.arbys;

import java.time.LocalDate;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        final int DAYS_IN_YEAR = 365;
        Scanner sc = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.println("Zadej rok: ");
        int year = sc.nextInt();

        boolean leapYearResult = year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0));
        int numberOfDays = DAYS_IN_YEAR + (leapYearResult ? 1 : 0);
        String separatorYear = currentYear > year ? (leapYearResult ? "byl" : "nebyl") : (currentYear < year ? (leapYearResult ? "bude" : "nebude") : (leapYearResult ? "je" : "není"));
        String separatorDays = currentYear > year ? "měl" : (currentYear < year ? "bude mít" : "má");

        System.out.format("Rok %s %s přestupný, %s %s dní.", year, separatorYear, separatorDays, numberOfDays);
    }
}
