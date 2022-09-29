package captainciaociao.kapitel_13._2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TimeLogger {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

    public static Duration parseString(String string) {
        Duration duration = Duration.ZERO;
        String[] parts = string.split(" - ");
        LocalDateTime startTime = LocalDateTime.parse(parts[0], formatter);
        LocalDateTime endTime = LocalDateTime.parse(parts[1], formatter);
        duration = Duration.between(startTime, endTime);

        return duration;
    }

    public static Duration parseAverage(String... args) {
        ArrayList<Duration> dates = new ArrayList<>();
        for (String string : args) {
            dates.add(parseString(string));
        }
        Duration average = Duration.ZERO;
        for (int i = 0; i < dates.size(); i++) {
            average = average.plus(dates.get(i));
        }
        average = average.dividedBy(dates.size());
        return average;
    }

    public static void main(String[] args) {
        String stringOne = "2022-03-12, 20:20 - 2022-03-12, 23:50";
        String stringTwo = "2022-04-01, 21:30 - 2022-04-02, 01:20";
        Duration totalDuration = parseString(stringOne).plus(parseString(stringTwo));
        Duration averageDuration = parseAverage(stringOne, stringTwo);
        System.out.printf("%d h %02d m%n", totalDuration.toHours(), totalDuration.toMinutesPart());
        System.out.printf("%d h %02d m%n", averageDuration.toHours(),
                averageDuration.toMinutesPart());
    }
}
