package ch01.sec03;

import java.util.Random;
import java.util.Scanner;

public class LikeVariableDeclaration {
    public static void main(String[] args) {
        int total = 0;
        Random generator = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = in.nextInt();
    }
}
