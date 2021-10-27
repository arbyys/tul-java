package cz.tul.alg.tue.arbys;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 11;
        System.out.println(String.format("suma %s + %s = %s", num1, num2, num1+num2));
        System.out.println(String.format("deleni %s / %s = %s", num2, num1, num2/num1));
        System.out.println(String.format("zbytek po deleni %s %% %s = %s", num2, num1, num2%num1));
    }
}