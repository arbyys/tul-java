package mylibrary;

public class ArrayTools {
    public static String show(int[] array, String divisor)
    {
        String returnString = "";
        for (int i = 0; i < array.length; i++)
        {
            divisor = i == array.length-1 ? "" : divisor;
            returnString += String.format("%s%s", array[i], divisor);
        }
        return returnString;
    }

    public static int firstIndexOf(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == number)
            {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] array, int number)
    {
        for (int i = array.length-1; i >= 0; i--)
        {
            if(array[i] == number)
            {
                return i;
            }
        }
        return -1;
    }

    public static int[] reverse(int[] array)
    {
        int[] tempArray = array.clone();
        for (int i = array.length-1; i >= 0; i--) {
            tempArray[array.length-1-i] = array[i];
        }
        return tempArray;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(show(reverse(arr), ", "));
    }
}
