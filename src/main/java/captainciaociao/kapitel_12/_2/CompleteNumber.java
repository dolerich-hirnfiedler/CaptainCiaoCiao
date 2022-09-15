package captainciaociao.kapitel_12._2;

import java.math.BigInteger;

public class CompleteNumber {
    public static BigInteger completeNumber(int... parts) {
        String composedString = "";
        for (int i = 0; i < parts.length; i++) {
            composedString += Integer.valueOf(parts[i]).toString();
        }
        return new BigInteger(composedString);
    }
}
