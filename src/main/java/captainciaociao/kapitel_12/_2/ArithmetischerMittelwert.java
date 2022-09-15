package captainciaociao.kapitel_12._2;

import java.math.BigInteger;

public class ArithmetischerMittelwert {
    public static long arithmeticMedian(long valueOne, long valueTwo) {
        BigInteger bIntegerOne = BigInteger.valueOf(valueOne);
        BigInteger bIntegerTwo = BigInteger.valueOf(valueTwo);
        BigInteger aMedian = new BigInteger("0");
        aMedian.add(bIntegerOne).add(bIntegerTwo);
        aMedian.divide(BigInteger.TWO);
        return aMedian.longValue();

    }

    public static void main(String[] args) {
        long valueOne = 333333333;
        long valueTwo = 333333333;
        System.out.printf("With Overflow: %f%n", (valueOne + valueTwo) / 2);
        System.out.printf("Without Overflow: %f%n", arithmeticMedian(valueOne, valueTwo));

    }
}
