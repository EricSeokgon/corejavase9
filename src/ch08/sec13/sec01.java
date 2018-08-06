package ch08.sec13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sec01 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 1, 2, 3, 5);
        //stream = Arrays.stream(values, from, to);
        IntStream zeroToNinetyNine = IntStream.range(0, 100); //상한 값을 제외한다.
        IntStream zeroToHundered = IntStream.rangeClosed(0, 100); //상환 값을 포함한다.

        String sentence = "\uD835\uDD46 is the set of octonions.";

        IntStream cpdes = sentence.codePoints();
    }
}
