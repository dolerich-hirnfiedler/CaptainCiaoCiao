package captainciaociao.kapitel_15._2_listen;

import java.util.List;

public class WeatherOccurrence {
    String weather;
    int occurrences;
    int startIndex;

    public WeatherOccurrence(String string) {
        occurrences = 0;
        startIndex = 0;
    }

    /**
     * @param weather
     * @param occurrences
     * @param startIndex
     */
    public WeatherOccurrence(String weather, int occurrences, int startIndex) {
        this.weather = weather;
        this.occurrences = occurrences;
        this.startIndex = startIndex;
    }

    public WeatherOccurrence() {
    }

    public static WeatherOccurrence longestSequenceOfSameWeather(List<String> weathers) {
        int localOccurrences = 1;
        int localStartIndex = 0;

        int globalOccurrences = localOccurrences;
        int globalStartIndex = localStartIndex;

        String reoccurningWeather = weathers.get(0);

        for (int i = 1; i < weathers.size() - 1; i++) {
            String currentWeather = weathers.get(i);
            if (currentWeather.equals(reoccurningWeather)) {
                localOccurrences++;
                if (localOccurrences > globalOccurrences) {
                    globalOccurrences = localOccurrences;
                    globalStartIndex = localStartIndex;
                }
            } else {
                localStartIndex = i;
                localOccurrences = 1;
                reoccurningWeather = currentWeather;
            }
        }
        return new WeatherOccurrence(weathers.get(globalStartIndex), globalOccurrences, globalStartIndex);
    }
}
