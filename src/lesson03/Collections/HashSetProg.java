package lesson03.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetProg {
    public static void main (String[] set){
        Set<String> test2 = new HashSet<>();

        test2.add("A");
        test2.add("B");
        test2.add("C");

        for (String val : test2){
            System.out.println(val);
        }


    }
}
