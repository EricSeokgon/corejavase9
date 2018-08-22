package ch12.sec02;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.stream.Stream;

public class sec01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate alonzosBirthday = LocalDate.of(1950, 6, 15);
        alonzosBirthday = LocalDate.of(1950, Month.JULY, 15);

        LocalDate programmersDay = LocalDate.of(2014, 1, 1).plusDays(255);

        Stream<LocalDate> allDaysInMay2018 = LocalDate.of(2018, 5, 1).datesUntil(LocalDate.of(2018, 6, 1));
        Stream<LocalDate> allMondaysInMay2018 = LocalDate.of(2018, 1, 1).datesUntil(LocalDate.of(2019, 1, 1), Period.ofDays(7));
        LocalDate.of(1900, 1, 1).getDayOfWeek().getValue();

    }
}
