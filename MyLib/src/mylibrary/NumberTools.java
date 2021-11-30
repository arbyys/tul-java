package mylibrary;

import java.util.Random;

public class NumberTools {
    /**
     * Determines if number is prime or not.
     * @param number given number
     * @return boolean if the given number is prime
     */
    public static boolean isPrime(int number)
    {
        final int sqrtOfNumber = (int)Math.sqrt(number);

        if(number < 2 || ((number % 2 == 0) && (number != 2)))
        {
            return false;
        }

        for(int divisor = 2; divisor <= sqrtOfNumber; divisor++ )
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int generateNumber(int min, int max)
    {
        Random r = new Random();
        return r.nextInt((max-min)+1)+min;
    }

    public static double countCosinus(double number, double eps)
    {
        double result = 1;
        double currentItem;
        long currentFactorial;
        long lastFactorial = 1;
        int calculateHelper = 2;
        int loopNumber = 2;
        while (true)
        {
            currentFactorial = (lastFactorial * (calculateHelper-1) * calculateHelper);
            currentItem = (Math.pow(number, calculateHelper)) / currentFactorial;
            if(currentItem < eps)
            {
                return result;
            }
            result = loopNumber % 2 == 0 ? (result - currentItem) :  (result + currentItem);
            calculateHelper += 2;
            lastFactorial = currentFactorial;
            loopNumber += 1;
        }
    }

    public static void main(String[] args) {
        double d = countCosinus(-2, 0.001);
        System.out.format("%.6f %n", d);
    }
}
