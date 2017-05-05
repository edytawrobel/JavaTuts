package com.advancedCal.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = askForInput("Enter a numeric value: ");
        String s2 = askForInput("Enter a numeric value: ");
        String choice = askForInput("Choose an operation (+ - * /)");

        double result = 0;

        try {
            switch (choice) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = subtractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognised operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Enter a numeric value" + e.getMessage());
        }
    }

    private static String askForInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }
}
