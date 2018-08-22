package ch12.sec03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class sec01 {
    public static void main(String[] args) {
        int year = 2018;
        int month = 03;
        LocalDate firstTuesFay = LocalDate.of(year, month, 1).with(
                TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)
        );
        TemporalAdjuster MEXT_WORKDAY = w -> {
            LocalDate result = (LocalDate) w;
            do {
                result = result.plusDays(1);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        };
    }
}
