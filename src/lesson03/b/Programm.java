package lesson03.b;

public class Programm {
    public static void main (String[] args){
        Cat cat = new Cat("grey", 25, 45, 3);
        Dog dog = new Dog("black", 50, 100, 16);
        Cat cat1 = new Cat("bars", "white", 25, 25, 25);

       /* dog.run(Speed.FAST);
        cat.run(Speed.SLOW);
        dog.eat("meet");
        cat.eat("milk");
        dog.sleep();
        cat.sleep();*/
        cat1.eat("milk");
        cat1.run(Speed.SLOW);
        cat1.putOnCollar();
       cat1.walk();
        cat1.sleep();


    }
}
