package lesson03.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args){
        List<String> arrList = new ArrayList<>();

        arrList.add("String 1");
        arrList.add("String 2");
        arrList.add("String 3");
        System.out.println(arrList);
        arrList.remove(1);


        List<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.add(4);
        System.out.println(arrList1);
        arrList1.remove(1);
        System.out.println(arrList1);
        arrList1.remove(new Integer(4));
        System.out.println(arrList1);
    }
}
