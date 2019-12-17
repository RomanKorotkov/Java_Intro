package lesson03.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

public class ifPresent {
    static <T> void ifPresent(Optional<T> o, Consumer<T> c) {
        if (o.isPresent()){
            c.accept(o.get());
        }
    }

    public static void main(String[]args){
        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> optional = test.stream().max(Integer::compare);
        ifPresent(optional, i -> System.out.println("A"));
    }
}
