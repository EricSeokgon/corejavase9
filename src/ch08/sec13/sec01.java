package ch08.sec13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sec01 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 1, 2, 3, 5);
        //stream = Arrays.stream(values, from, to);
        IntStream zeroToNinetyNine = IntStream.range(0, 100);

    }
}
