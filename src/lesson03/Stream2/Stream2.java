package lesson03.Stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream2 {
    public static int count = 0;
    public static void main(String[] args){
        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Kyiv");
        cities.add("Oslo");
        cities.add("Stokholm");
        cities.add("Helsinki");

        cities.stream()
                .filter(city -> city.length() > 6)
                .peek(city -> count++)
                .forEach(city -> System.out.println(city));
        System.out.println(count);
    }
}
