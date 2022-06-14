package captainciaociao.kapitel_4._2_eindimensionale_arrays.aufgabe_7;

import java.util.Random;

public class MountainFactory {
    private static final Random RANDOM = new Random();

    private static int[] generateAltitude(int height) {
        int[] constructionInformation = new int[2 * height + 1];
        int size = 0;
        int j = 0;
        int index = 0;
        for (int i = 0; i < constructionInformation.length; i++) {
            constructionInformation[i] = RANDOM.nextInt(2) + 1;
            size += constructionInformation[i];
        }

        int[] altitude = new int[size];
        for (int i = 0; i < constructionInformation.length; i++) {
            j = 0;
            for (j = 0; j < constructionInformation[i]; j++) {
                if (i <= height) {
                    altitude[index] = i;
                } else {
                    altitude[index] = constructionInformation.length-1 - i;
                }
                index++;
            }
        }
        return altitude;
    }

    public static Mountain initMountain(int height) {
        return new Mountain(generateAltitude(height));
    }
}
