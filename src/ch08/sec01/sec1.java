package ch08.sec01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class sec1 {
    public static void main(String[] args) throws IOException {
        String contets = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contets.split("\\PL+"));

        int count = 0;
        for (String w : words) {
            if (w.length() > 12) {
                count++;
            }
        }

        long count2 = words.stream()
                .filter(w -> w.length() > 12)
                .count();

        long count3 = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();

        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
    }
}
