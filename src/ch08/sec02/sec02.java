package ch08.sec02;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class sec02 {
    public static void main(String[] args) throws IOException {
        String contets = new String(Files.readAllBytes(
                Paths.get("C:\\windows-version.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contets.split("\\PL+"));
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        Stream<String> slience = Stream.empty();
        Stream<String> echos = Stream.generate(() -> "Echo");
        Stream<Double> random = Stream.generate(Math::random);
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

        BigInteger limit = new BigInteger("10000000");
        Stream<BigInteger> instegers = Stream.iterate(BigInteger.ZERO,
                n -> n.compareTo(limit) < 0,
                n -> n.add(BigInteger.ONE));

        System.out.println(words);
        System.out.println(song);
        System.out.println(slience);
        System.out.println(echos);
        System.out.println(random);
        System.out.println(instegers);

    }
}
