package ch08.sec07;

import java.util.Optional;
import java.util.stream.Stream;

public class sec07 {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("홍길동", "유저인증", "자바");
        Optional<String> optionalString = words.max(String::compareToIgnoreCase);

        String result = optionalString.orElse("");
        String result1 = optionalString.orElseGet(() -> System.getProperty("myapp.default"));
        String result2 = optionalString.orElseThrow(IllegalStateException::new);

        Optional<String> result3 = optionalString.or(() -> Optional.ofNullable(System.getProperty("myapp.default")));

    }
}
