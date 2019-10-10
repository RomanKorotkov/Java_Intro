package lesson03.a;

public class Dog extends Animals{


    public Dog(String color, int height, int length, int weight) {
        super(color, height, length, weight);
    }

    @Override
    protected String getType(){
        return this.getClass().getSimpleName();
    }
}