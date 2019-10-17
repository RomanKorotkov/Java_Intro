package lesson03.b;

public interface Controlable {
    void putOnCollar();
    default void walk(){
        System.out.printf(getName() + " walking %n");
    }
    String getName();

}
