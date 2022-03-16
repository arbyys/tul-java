import java.util.Arrays;

public class Polynom {
    public int[] getCoefficients() {
        return coefficients;
    }

    private int[] coefficients;

    public Polynom(int... coefficients)
    {
        boolean hasJustZeroes = true;
        for (int currentCoef : coefficients)
        {
            if(currentCoef != 0)
            {
                hasJustZeroes = false;
                break;
            }
        }
        if(hasJustZeroes)
        {
            throw new IllegalArgumentException("Polynom needs to have other values than zeroes.");
        }

        int rlen = coefficients.length;
        while (coefficients[rlen-1] == 0)
        {
            --rlen;
        }
        this.coefficients = Arrays.copyOf(coefficients, rlen);
    }

    public int getDegree()
    {
        return coefficients.length-1;
    }

    public int getCoeficientOfIndex(int index)
    {
        return coefficients[index];
    }

    public double calculateValue(int x)
    {
        double result = 0.0;

        for (int i = 0; i <= getDegree(); i++) {
            result += Math.pow(coefficients[i] * x, i);
        }

        return result;
    }

    @Override
    public String toString()
    {
        StringBuilder returnString = new StringBuilder();
        int index = 0;
        for (int currentCoef : coefficients)
        {
            if(index == 0)
            {
                returnString.insert(0, currentCoef);
            }
            else
            {
                returnString.insert(0, String.format("(%sx)^%d + ", currentCoef, index));
            }
            index++;
        }
        return returnString.toString();
    }

}
