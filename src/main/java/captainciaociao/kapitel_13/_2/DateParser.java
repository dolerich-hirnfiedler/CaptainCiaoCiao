package captainciaociao.kapitel_13._2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

public class DateParser {
    public static Optional<LocalDate> parseDate(String string) {
        LocalDate now = LocalDate.now();

        Collection<Function<String, LocalDate>> parsers = Arrays.asList(
                input -> LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-M-d")),
                input -> LocalDate.parse(input, DateTimeFormatter.ofPattern("d/M/yyyy")),
                input -> LocalDate.parse(input, DateTimeFormatter.ofPattern("d/M/yy")),
                input -> input.equalsIgnoreCase("yesterday") ? now.minusDays(1) : null,
                input -> input.equalsIgnoreCase("today") ? now : null,
                input -> input.equalsIgnoreCase("tomorrow") ? now.plusDays(1) : null,
                input -> new Scanner(input).findAll("(\\d+) days? ago")
                        .map(matchResult -> matchResult.group(1)).mapToInt(Integer::parseInt)
                        .mapToObj(now::minusDays).findFirst().orElse(null));


        for (Function<String, LocalDate> parser : parsers) {
            try {
                return Optional.of(parser.apply(string));
            } catch (Throwable e) {
                System.out.println("Error " + e.getMessage());
                e.printStackTrace();
            }
        }

        return Optional.empty();

        // DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("[d/M/yyy]")
        // .appendPattern("[yyyy-MM-dd]")
        // .parseDefaulting(ChronoField.MONTH_OF_YEAR, YearMonth.now().getMonthValue())
        // .parseDefaulting(ChronoField.DAY_OF_MONTH, LocalDate.now().getDayOfMonth())
        // .toFormatter();
    }

    public static void main(String[] args) {
        File data = new File("dates.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
                String string = "2020-10-10\n" + "2020-12-2\n" + "1/3/1976\n" + "1/3/2020\n"
                        + "tomorrow\n" + "today\n" + "yesterday\n" + "1 day ago\n";
                FileWriter dataWriter = new FileWriter(data);
                dataWriter.write(string);
                dataWriter.close();
            } catch (IOException e) {
                System.out.printf("Something went wrong%n");
                e.printStackTrace();
            }
        }

    }
}
