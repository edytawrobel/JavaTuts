package chapter.nine.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by edytawrobel on 06/05/2017.
 */
public class stateCollectionMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");   //2 args: key + value
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        String capital = map.get("California");
        System.out.println(capital);

        System.out.println("all keys: " + map.keySet());
        map.remove("Oregon");
        System.out.println(map);


        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
        }


    }

}
