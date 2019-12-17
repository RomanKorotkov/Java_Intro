package lesson03.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

public class ifPresentOrElse {
    static <T> void ifPresentOrElse(Optional<T> o, Consumer<T> c, Runnable r){

        if(o.isPresent()) {
            c.accept(o.get());
        } else {
            r.run();
        }
    }

    public static void main(String[]args){
        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> if_present_orelse = test.stream().max(Integer::compare);

        ifPresentOrElse(if_present_orelse, System.out::println, () -> System.out.println("Not found"));

        test.addAll(Arrays.asList(new Integer[]{1, 5, 9}));
        Optional<Integer> if_present_orelse2 = test.stream().max(Integer::compare);
        ifPresentOrElse(if_present_orelse2, System.out::println, () -> System.out.println("Not found"));
    }
}
