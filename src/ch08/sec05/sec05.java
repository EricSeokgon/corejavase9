package ch08.sec05;

import jdk.nashorn.api.tree.SimpleTreeVisitorES5_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class sec05 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(contents.split("\\PL+")).skip(1);

        Stream<String> uniqueWords = Stream.of("merrily", "merrily", "merrily", "gently").distinct();
        Stream<String> longestFirst = words.sorted(Comparator.comparing(String::length).reversed());

        Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e))
                .limit(20).toArray();

    }
}
