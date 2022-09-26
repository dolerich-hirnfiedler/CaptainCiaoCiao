package captainciaociao.kapitel_13._2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Birthday {
    public static void main(String[] args) {

        LocalDate beaufortBday = LocalDate.of(1774, Month.MAY, 27);
        LocalDate bDay = LocalDate.of(Year.now().getValue(), Month.MAY, 27);
        DayOfWeek bDayOfWeek = bDay.getDayOfWeek();
        System.out.printf("BDay: %s%n", bDayOfWeek.toString());
    }
}
