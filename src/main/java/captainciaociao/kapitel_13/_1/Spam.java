package captainciaociao.kapitel_13._1;

import java.util.Locale;
import java.util.Random;

public class Spam {
    public static void main(String[] args) {
        Locale[] locals = {Locale.CANADA, Locale.CANADA_FRENCH, Locale.CHINA, Locale.CHINESE,
                Locale.ENGLISH, Locale.FRANCE, Locale.FRENCH, Locale.GERMAN, Locale.GERMANY,
                Locale.ITALIAN, Locale.ITALY, Locale.JAPAN, Locale.JAPANESE, Locale.KOREA,
                Locale.KOREAN, Locale.PRC, Locale.SIMPLIFIED_CHINESE, Locale.TAIWAN,
                Locale.TRADITIONAL_CHINESE, Locale.UK, Locale.US,};
        Random RANDOM = new Random();
        double random = RANDOM.nextDouble() * 2_000 + 1_0000;
        for (Locale locale : locals) {
            System.out.printf("%6s: %s%n", locale.toString(),
                    String.format(locale, "Buy Bitcoins for just $%f", random));
        }


    }
}
