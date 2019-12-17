package lesson03.Stream;

import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] str) {
        int[] numbers = {-10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10};
        long stream = IntStream.of(numbers).filter(i -> i < 0).count();
        long stream1 = IntStream.of(numbers).skip(3).count();
        OptionalInt stream2 = IntStream.of(numbers).max();
        OptionalInt stream3 = IntStream.of(numbers).min();
        boolean stream4 = IntStream.of(numbers).allMatch(i -> i < 11);
        boolean stream5 = IntStream.of(numbers).allMatch(i -> i > -22);
        OptionalInt stream6 = IntStream.of(numbers).findFirst();
        int stream7 = IntStream.of(numbers).findAny().getAsInt();


        System.out.println(stream);
        System.out.println(stream1);
        System.out.println(stream2);
        System.out.println(stream3.getAsInt());
        System.out.println(stream4);
        System.out.println(stream5);
        System.out.println(stream6);
        System.out.println(stream7);



    }
}
