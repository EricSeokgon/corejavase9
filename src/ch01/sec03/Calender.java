package ch01.sec03;

public class Calender {
    public static final int DAYS_PER_WEEK = 7;

    public static void main(String[] args) {
        final int DAYS_IN_FEBRUARY;
        boolean leapYear = true;
        if (leapYear) {
            DAYS_IN_FEBRUARY = 29;
        } else {
            DAYS_IN_FEBRUARY = 28;
        }
    }
}
