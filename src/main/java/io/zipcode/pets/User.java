package io.zipcode.pets;

import java.util.Scanner;


public class User {
    public static String stringInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String out = scanner.next();
        return out;
    }
    public static int integerInput(String prompt){
        System.out.println(prompt);
    Scanner scan = new Scanner(System.in);
        int out = scan.nextInt();
        return out;
    }
}