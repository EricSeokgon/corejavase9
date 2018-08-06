package ch08.sec14;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class sec01 {
    public static void main(String[] args) throws IOException {
        String contets = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contets.split("\\PL+"));

        Map<Integer, Long> shortWordCounters = words.parallelStream().filter(s -> s.length() < 12)
                .collect(groupingBy(String::length, counting()));

    }
}
