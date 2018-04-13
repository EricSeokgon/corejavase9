package ch01.sec05;

public class StringsAttached {
    public static void main(String[] args) {
        String location = "Java";
        String greeting = "Hello" + location;
        System.out.println(greeting);

        int age = 42;
        String output = age + " year";
        System.out.println(output);

        System.out.println("Next year, you will be" + age + 1);
        System.out.println("Next year, you will be" + (age + 1));

        String names = String.join(", ", "Peter", "Paul", "mary");
        System.out.println(names);

    }
}
