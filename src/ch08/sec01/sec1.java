package ch08.sec01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class sec1 {
    public static void main(String[] args) throws IOException {
        String contets = new String(Files.readAllBytes(
                Paths.get("text.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contets.split("\\PL+"));
    }
}
