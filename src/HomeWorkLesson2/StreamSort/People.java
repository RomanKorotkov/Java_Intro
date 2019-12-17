package HomeWorkLesson2.StreamSort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class People{
    String name;
    String surname;
    String sex;
    int age;

    public People(String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    boolean test(People people){
        return people.getAge()<40;
    }


    public static void main(String[] args){
        List<People> people = new ArrayList<>();
        people.add(new People("Nina", "Hagen", "female", 50));
        people.add(new People("Alla", "Markova", "female", 40));
        people.add(new People("Boris", "Rakoid", "male", 60));
        people.add(new People("Antonina", "Tendur", "female", 30));
        people.add(new People("Anatoliy", "Dirimanov", "male", 50));

        people.stream().map(human -> human.getName()).forEach(human -> System.out.println(human));
        people.stream().map(human -> human.getAge()).limit(2).forEach(human -> System.out.println(human));
        people.stream().map(human -> human.getSex()).distinct().forEach(human -> System.out.println(human));
        people.stream().map(human -> human.getAge()).distinct().forEach(human -> System.out.println(human));
        long a =  people.stream().map(human -> human.getName()).distinct().count();
        System.out.println(a);
        long i = people.stream().filter(human -> {
            if (human.getSex().equals("female")){
                return human.getAge()<40;
            } else {
                return human.getAge()>50;
            }
        }).count();
        System.out.println(i);


    }

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public People setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public People setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public People setAge(int age) {
        this.age = age;
        return this;
    }
}











/*public class PhonesStream {
    String model;
    int price;
    private static int sum = 0;


    public PhonesStream(String model, int price) {
        this.model = model;
        this.price = price;
    }

    boolean high_price (PhonesStream mob){
        return mob.getPrice() > 4000;
    }


    public static void main(String[] args){
        List<PhonesStream> phone = new ArrayList<>();
        phone.add(new PhonesStream("Xiaomi NODE 4x", 5000));
        phone.add(new PhonesStream("Huawei 569", 6000));
        phone.add(new PhonesStream("Pixel 2", 4000));
        phone.add(new PhonesStream("Galaxy S9", 4000));
        phone.add(new PhonesStream("iPhone 8", 10000));
        phone.add(new PhonesStream("Samsung E 80", 3000));
        phone.add(new PhonesStream("Nokia", 2000));
        phone.add(new PhonesStream("Nokia", 2000));
        phone.add(new PhonesStream("Galaxy S9", 4000));
        phone.add(new PhonesStream("Xiaomi NODE 4x", 5000));


        phone.stream().filter(mobile -> mobile.getPrice()< 5000).forEach(mobile -> System.out.println(mobile.getModel()));
        System.out.printf("%n");
        phone.stream().map(mobile -> mobile.getModel()).forEach(mobile -> System.out.println(mobile));
        System.out.printf("%n");
        phone.stream().map(mobile -> mobile.getPrice()).forEach(mobile -> System.out.println(mobile - 1638));
        System.out.printf("%n");
        phone.stream().map(mobile -> mobile.getModel()).filter(mobile -> mobile.length()>10).peek(mobile -> sum++).forEach(mobile -> System.out.println(sum));
        System.out.printf("%n");
        phone.stream().map(mobile -> mobile.getModel()).distinct().forEach(mobile -> System.out.println(mobile));
        System.out.printf("%n");
        phone.stream().map(mobile -> mobile.getModel()).limit(2).forEach(mobile -> System.out.println(mobile));
        System.out.printf("%n");
        phone.stream().filter(mobile -> mobile.getPrice()>4000).forEach(mobile -> System.out.println(mobile));
        phone.stream().filter(mobile -> {
            if (mobile.getPrice() > 400);
            return mobile.getPrice();

                else return mobile.getModel();

        });



    }

    public String getModel() {
        return model;
    }

    public PhonesStream setModel(String model) {
        this.model = model;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public PhonesStream setPrice(int price) {
        this.price = price;
        return this;
    }

    public static int getCount() {
        return sum;
    }

    public static void setCount(int count) {
        PhonesStream.sum = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhonesStream that = (PhonesStream) o;

        if (price != that.price) return false;
        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "PhonesStream{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}*/
