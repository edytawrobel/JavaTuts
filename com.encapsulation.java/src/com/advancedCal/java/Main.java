package com.advancedCal.java;

import com.advancedCal.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();

        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("GreenMe", 0x2E0849, 5));
        olives.add(new Olive("Ligurian", 0x000000, 2));

//        Olive olive1 = new Olive("Kalamata", 0x2E0854, 3);
//        olive1.setName("greenMe");
//        olives.add(olive1);
//
//        Olive olive2 = new Olive("GreenMe", 0x2E0849, 5);
//        olive2.setOil(1);
//        olives.add(olive2);
//
//        Olive olive3 = new Olive("Ligurian", 0x000000, 2);
//        olive3.setOil(6);
//        olives.add(olive3);

       OlivePress press = new OlivePress();
       int totalOil = press.getOil(olives);
       System.out.println("this is how much oil you've got: " + totalOil);
    }
}
