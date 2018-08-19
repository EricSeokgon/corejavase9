package ch12.sec02;

import java.time.LocalDate;
import java.time.Month;

public class sec01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate alonzosBirthday = LocalDate.of(1950, 6, 15);
        alonzosBirthday = LocalDate.of(1950, Month.JULY, 15);
    }
}
