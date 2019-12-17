package lesson03.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main (String[] map){
        Map<String,String> test = new HashMap<>();

        test.put("A", "B");
        test.put("C", "D");
        test.put("E", "F");

        for (String val : test.values()){
            System.out.println(val);
        }

        for (String key : test.keySet()){
            System.out.println(key);
        }

        for (Map.Entry<String,String> val2 : test.entrySet()){
            System.out.printf("key: %s valuee: %s %n", val2.getKey(), val2.getValue());
        }

    }
}
