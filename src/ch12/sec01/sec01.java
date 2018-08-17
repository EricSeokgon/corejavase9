package ch12.sec01;

import java.time.Duration;
import java.time.Instant;

public class sec01 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        runAlgorithm();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();

    }

    private static void runAlgorithm() {

    }
}
