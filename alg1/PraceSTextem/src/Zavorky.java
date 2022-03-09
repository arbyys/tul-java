import java.util.*;
import java.util.stream.Collectors;

public class Zavorky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> queue =  new ArrayList<>();

        String stringToParse = "";

        while(true)
        {
            String currentToParse = sc.nextLine();
            if(currentToParse.toLowerCase().contains("end"))
            {
                break;
            }
            stringToParse = stringToParse.concat(currentToParse);
        }

        String[] text = stringToParse.split("");

        boolean alreadyDone = true;

        for (String s : text) {
            if(Arrays.asList("[", "{", "(").contains(s))
            {
                switch(s) {
                    case "[":
                        queue.add("]");
                        break;
                    case "(":
                        queue.add(")");
                        break;
                    case "{":
                        queue.add("}");
                        break;
                }
            }
            else if(Arrays.asList("]", "}", ")").contains(s))
            {
                if(Objects.equals(queue.get(queue.size() - 1), s))
                {
                    queue.remove(queue.size() - 1);
                }
                else
                {
                    alreadyDone = false;
                    break;
                }
            }
        }

        int result = (queue.size() == 0 && alreadyDone) ? 1 : 0;

        System.out.println(result);
    }
}
