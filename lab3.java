package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String pasword = scanner.nextLine();
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[_]*).{8,}$";
        if (pasword.matches(pattern)) {
            System.out.println("Пароль надежный");
        }
        else {
            System.out.println("Пароль ненадежный");
        }
        scanner.close();
    }
}