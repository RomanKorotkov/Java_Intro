package lesson03.b;

public class Dog extends Animals implements Controlable {


    public Dog(String color, int height, int length, int weight) {
        super(color, height, length, weight);
    }

    public Dog(String alias, String color, int height, int length, int weight) {
        super(alias, color, height, length, weight);
    }

    @Override
    protected String getType(){
        return this.getClass().getSimpleName();
    }

    @Override
    public void putOnCollar() {
        System.out.println("Put on metal collar");

    }

    @Override
    public String getName() {
        return getAlias();
    }
}