package cz.tul.tue.alg.arbys;

public class Variants {

    static void userGuesses() {
        int guess;
        boolean win = false;
        int number = generateNumber(GuessingGame1.min, GuessingGame1.max);
        do{
            guess = GuessingGame1.sc.nextInt();
            if(number > guess)
            {
                System.out.println("Počítač si myslí větší číslo");
            }
            else if(number < guess)
            {
                System.out.println("Počítač si myslí menší číslo");
            }
            else
            {
                System.out.println("Uhodl jsi");
                win = true;
            }
        }while (!win);
    }

    private static int generateNumber(int min, int max)
    {
        return (int)(Math.random() * (max-min+1) + min);
    }

    static void computerGuesses() {
        System.out.println("todo");
    }

    public static void main(String[] args){
        userGuesses();
    }
}
