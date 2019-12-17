package lesson03.Comparator;

import java.util.stream.Stream;

public class ComparatorResult {
    public static void main(String[] args){
        Phone phone1 = new Phone ("iPhone X", "Apple", 20000);
        Phone phone2 = new Phone ("G5s", "Moto", 5000);
        Phone phone3 = new Phone ("Mi4", "Xiaomi", 4000);
        Phone phone4 = new Phone ("iPhone XL", "Apple", 30000);

        //Comparable
        Stream.of(phone1, phone2, phone3, phone4).sorted().forEach(mobile -> System.out.printf("%s %s %s %n",
                mobile.getPrice(), mobile.getCompany(), mobile.getName()));
        System.out.printf("%n");
        //Comparator
        Stream.of(phone1, phone2, phone3, phone4).sorted(new Comp()).forEach(mobile -> System.out.printf("%s %s %s %n",
                mobile.getPrice(), mobile.getCompany(), mobile.getName()));
    }
}
