package captainciaociao.kapitel_13._2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(Year.now().getValue(), Month.SEPTEMBER, 19);

        String dateFormattedM = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateFormattedF = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateFormattedS = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String dateFormattedL = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        String dateItalian = String.format(Locale.ITALIAN, dateFormattedL);

        System.out.printf("%s%n", date.toString());
        System.out.println(dateFormattedM);
        System.out.println(dateFormattedF);
        System.out.println(dateFormattedS);
        System.out.println(dateFormattedL);
        System.out.println(dateItalian);

    }
}
