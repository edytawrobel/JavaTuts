package chapter.ten.java;

import chapter.ten.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edytawrobel on 06/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);

        for (Olive o : olives) {
            System.out.println(o.name);
        }
    }
}
