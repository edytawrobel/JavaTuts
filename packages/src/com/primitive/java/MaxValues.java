package com.primitive.java;

/**
 * Created by edytawrobel on 27/04/2017.
 */
public class MaxValues {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte: " + b);

        if (b > Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte: " + b);

    }
}
