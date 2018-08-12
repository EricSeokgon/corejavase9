package ch10.sec03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class sec01 {
    private static boolean done = false;

    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++)
                System.out.println("Hello " + i);
            done = true;

        };
        Runnable goodbyes = () -> {
            int i = 1;
            while (!done) i++;
            System.out.println("Goodbye " + i);

        };
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);

    }
}


