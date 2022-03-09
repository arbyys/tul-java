package cz.tul.alg.tue.arbys;

public class P3PriceToBills {
    public static void main(String[] args) {
        int money = 188;
        int moneyWorking = money;
        int[] values = {100, 50, 20, 10, 5, 2, 1};
        int[] results = {0, 0, 0, 0, 0, 0, 0};

        int index = 0;
        for (int i : values)
        {
            results[index] = moneyWorking/i;
            moneyWorking = moneyWorking - (i * (moneyWorking / i));
            index++;
        }

        System.out.println(String.format("Pro %sKč", money));

        index = 0;
        for (int i : results)
        {
            System.out.println(String.format("Počet bankovek %s: %s", values[index], i));
            index++;
        }
    }
}
