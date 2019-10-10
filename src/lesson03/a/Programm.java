package lesson03.a;

public class Programm {
    public static void main (String[] args){
        Cat cat = new Cat("grey", 25, 45, 3);
        Dog dog = new Dog("black", 50, 100, 16);

        dog.run(Speed.FAST);
        cat.run(Speed.SLOW);
        dog.eat("meet");
        cat.eat("milk");
        dog.sleep();
        cat.sleep();
    }
}
