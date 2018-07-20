package ch08.sec03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class sec03 {
    public static void main(String[] args) throws IOException {
        String contets = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contets.split("\\PL+"));
        Stream<String> longWords = words.stream().filter(w -> w.length() > 12);
        Stream<String> lowercaseWorlds = words.stream().map(String::toLowerCase);
        Stream<String> firstLetters = words.stream().map(s -> s.substring(0, 1));

        System.out.println(longWords);
        System.out.println(lowercaseWorlds);
        System.out.println(firstLetters);
    }

    public static Stream<String> codePoints(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }
}
