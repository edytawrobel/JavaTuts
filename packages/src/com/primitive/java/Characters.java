package com.primitive.java;

/**
 * Created by edytawrobel on 28/04/2017.
 */
public class Characters {

    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("char 1: " + c1);
        System.out.println("char 2: " + c2);
        System.out.println("char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("dollar: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }
}
