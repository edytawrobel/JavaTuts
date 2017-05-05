package com.primitive.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        byte b = 1;
//        short sh = 1;
//        int i = 1;
//        long l = 1L;
//        float f = 1f;
//        double d = 1d;
//
//        System.out.println("Byte: " + b);
//        System.out.println("Short: " + sh);
//        System.out.println("Integer: " + i);
//        System.out.println("Long: " + l);
//        System.out.println("Float: " + f);
//        System.out.println("Double: " + d);
        double value = .012;
        double pSum = value + value + value;
        System.out.println(pSum);

        String strValue = Double.toString(value); //helper class for double values, Double, convert number to value
        System.out.println("strValue: " + strValue);

        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("big sum: " + bigSum.toString());
    }
}
