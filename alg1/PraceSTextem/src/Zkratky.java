import java.util.*;

public class Zkratky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTasks = sc.nextInt();
        StringBuilder result;
        sc.nextLine();
        for (int i = 1; i <= totalTasks; i++) {
            result = new StringBuilder();
            String current = sc.nextLine();
            String[] text = current.split(" ");
            for (String s : text) {
                s = s.toUpperCase();
                if(s.length() <= 2)
                {
                    continue;
                }
                result.append(s.charAt(0));
            }
            System.out.println(result);
        }
    }
}
