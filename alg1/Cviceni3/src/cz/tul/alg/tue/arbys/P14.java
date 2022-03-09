package cz.tul.alg.tue.arbys;

import java.time.LocalDate;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        // VSTUP
        final int DAYS_IN_YEAR = 365;
        int currentYear = LocalDate.now().getYear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rok: ");
        int year = sc.nextInt();

        // VÝPOČET
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0 || (year % 400 == 0));
        int numberOfDays = DAYS_IN_YEAR + (leapYear ? 1 : 0);
        String separatorYear = currentYear > year ? (leapYear ? "byl" : "nebyl") : (currentYear < year ? (leapYear ? "bude" : "nebude") : (leapYear ? "je" : "není"));
        String separatorDays = currentYear > year ? "měl" : (currentYear < year ? "bude mít" : "má");

        // VÝSTUP
        System.out.format("Rok %s %s přestupný, %s %s dní.", year, separatorYear, separatorDays, numberOfDays);
    }
}
