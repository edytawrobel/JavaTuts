package com.advancedCal.java;

import com.advancedCal.java.utilities.MathHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main calc = new Main();
        calc.calculate();
    }

    protected void calculate() {

        InputHelper helper = new InputHelper();
        String s1 = helper.askForInput("Enter a numeric value: ");
        String s2 = helper.askForInput("Enter a numeric value: ");
        String choice = helper.askForInput("Choose an operation (+ - * /)");


        double result = 0;

        try {
            switch (choice) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
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

    class InputHelper {

        private String askForInput(String prompt) {
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }
}
