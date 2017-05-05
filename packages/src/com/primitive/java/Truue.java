package com.primitive.java;

/**
 * Created by edytawrobel on 28/04/2017.
 */
public class Truue {

    static boolean bDef;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("the value of b1 is: " + b1);
        System.out.println("the value of b2 is: " + b2);
        System.out.println("the value of b2 is: " + bDef);

        boolean b3 = !b1;
        System.out.println("the value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("the value of b4 is: " + b4);

    }
}
