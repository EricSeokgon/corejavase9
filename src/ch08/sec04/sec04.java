package ch08.sec04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static ch08.sec03.sec03.codePoints;

public class sec04 {
    public static void main(String[] args) throws IOException {
        Stream<Double> randoms = Stream.generate(Math::random).limit(100);
        String contents = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(contents.split("\\PL+")).skip(1);

        Stream<String> initialDigits = codePoints(contents).takeWhile(s -> "0123456789".contains(s));

        Stream<String> withoutInitialWhiteSpace = codePoints(contents).dropWhile(s -> s.trim().length() == 0);

        Stream<String> combined = Stream.concat(codePoints("Hello"), codePoints("World"));




    }
}
