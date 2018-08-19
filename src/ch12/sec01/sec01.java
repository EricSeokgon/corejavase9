package ch12.sec01;

import java.time.Duration;
import java.time.Instant;

public class sec01 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        runAlgorithm();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        Instant start2 = Instant.now();
        runAlgorithm();
        Instant end2 = Instant.now();
        Duration timeElapsed2 = Duration.between(start2, end2);
        long millis = timeElapsed.toMillis();
        Duration oneWeek = Duration.ofDays(7);
        long secondsPerWeek = oneWeek.toSeconds();
        boolean overTenTimesFaster = timeElapsed.multipliedBy(10).minus(timeElapsed2).isNegative();


    }

    private static void runAlgorithm() {

    }
}
