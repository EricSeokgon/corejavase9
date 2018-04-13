package ch01.sec05;

public class StringsAttached {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        String location = greeting.substring(7, 12);
        System.out.println(location);


        String names = "Peter, Paul, mary";
        String[] result = names.split(", ");
        int i = 0;
        while (i < result.length) {
            final int i1 = i++;
            System.out.println(result[i1]);
        }


    }
}
