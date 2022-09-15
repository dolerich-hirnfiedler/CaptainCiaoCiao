package captainciaociao.kapitel_12._2;

import java.math.BigInteger;
import javax.management.InvalidAttributeValueException;

public class Fraction extends Number implements Comparable {

    public final int numerator;
    public final int denominator;


    // Help methods
    private static int[] shorten(int numerator, int denominator) {
        BigInteger numeratorBigInt = new BigInteger(Integer.valueOf(numerator).toString());
        BigInteger denominatorBigInt = new BigInteger((Integer.valueOf(denominator).toString()));
        BigInteger gcd = numeratorBigInt.gcd(denominatorBigInt);
        int[] returnValue = new int[2];

        while (gcd != BigInteger.ONE) {
            numeratorBigInt = numeratorBigInt.divide(gcd);
            denominatorBigInt = denominatorBigInt.divide(gcd);
            gcd = numeratorBigInt.gcd(denominatorBigInt);
        }
        returnValue[0] = Integer.valueOf(numeratorBigInt.toString());
        returnValue[1] = Integer.valueOf(denominatorBigInt.toString());
        return returnValue;

    }


    /**
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("value of denominator cant be 0");
        }
        int[] values = shorten(numerator, denominator);
        this.numerator = values[0];
        this.denominator = values[1];
    }


    /**
     *
     * @param numerator
     */
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }


    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        return 0;
    }

}
