package mylibrary;

public class ArrayTools {
    public static String show(int[] array, String divisor)
    {
        String returnString = "";
        for (int i = 0; i < array.length; i++)
        {
            returnString += String.format("%s%s", array[i], divisor);
        }
        return returnString;
    }
}
