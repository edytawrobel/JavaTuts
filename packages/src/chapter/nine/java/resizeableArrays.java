package chapter.nine.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by edytawrobel on 06/05/2017.
 */
public class resizeableArrays {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();  //constructor method for ArrayList, not for List interface, you usually do not create an instance of an interface, however, it is possible to do so
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        list.remove(0);

        String state = list.get(1);

        int pos = list.indexOf("Oregon");
        System.out.println(pos);

        System.out.println("here" + list);

        Iterator<String> iterator = list.iterator();  // collection interface
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        for (String value : list) {
            System.out.println(value);
        }

        list.forEach(System.out::println);
    }
}
