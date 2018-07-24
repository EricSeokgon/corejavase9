package ch08.sec06;

import java.util.Optional;
import java.util.stream.Stream;

public class sec06 {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("홍길동", "유저인증", "자바");
        Optional<String> largest = words.max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));

        //Optional<String> startsWithQ = words.parallel().filter(s -> s.startsWith("Q")).findAny();


    }
}
