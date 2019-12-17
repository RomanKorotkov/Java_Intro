package lesson03.Optional;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class OptionalMethods {
    public static void main(String[] args) {

        myTest();
        method_IsPresent();
        method_OrElse();
        method_ElseGet();
        method_IfPresentOrElse();


        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 10}));
        //Show min
        Optional<Integer> min = array.stream().min(Integer::compare);
        System.out.printf("Min number - %s %n", min.get());
        //Show max
        Optional<Integer> max = array.stream().max(Integer::compare);
        System.out.printf("Max number - %s %n", max.get());
        //Show reduce
        Optional<Integer> reduce = array.stream().reduce(Integer::compare);
        System.out.printf("Reduce number - %s %n", reduce.get());
        method_ElseThrow();

    }

    static void method_IsPresent() {
        ArrayList<Integer> empty_array = new ArrayList<>();
        empty_array.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> empty = empty_array.stream().max(Integer::compare);
        if (empty.isPresent()) {
            System.out.printf("Number is %s %n", empty.get());
        } else {
            System.out.printf("Is absent %n");
        }
    }

    static void method_OrElse() {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> or_else = array.stream().max(Integer::compare);
        System.out.printf("Default number is %s %n", or_else.orElse(2019));
    }

    static void method_ElseGet() {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> else_get = array.stream().min(Integer::compare);
        Random random = new Random();
        System.out.printf("Array is empty, please take random number - %s %n", else_get.orElseGet(() -> random.nextInt(999999999)));
    }

    static void method_ElseThrow() {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> else_throw = array.stream().max(Integer::compare);
        System.out.printf("Check error %n");
        System.out.println(else_throw.orElseThrow(IllegalAccessError::new));
    }

    static void method_IfPresentOrElse() {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{951}));
        Optional<Integer> ifpresent_orelse = array.stream().min(Integer::compare);
        ifpresent_orelse.ifPresent(i -> System.out.println(i));


    }

    static void myTest(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(80);
        test.add(99);

        Optional<Integer> my = test.stream().max(Integer::compare);
        System.out.println(my.get());
    }



}




