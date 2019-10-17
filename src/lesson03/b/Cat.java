package lesson03.b;

public class Cat extends Animals implements Controlable {


    public Cat(String color, int height, int length, int weight) {
        super(color, height, length, weight);
    }

    public Cat(String alias, String color, int height, int length, int weight) {
        super(alias, color, height, length, weight);
    }

    @Override
    protected String getType(){
        return this.getClass().getSimpleName();
    }

    @Override
    public void putOnCollar() {
        System.out.println("Put on gum collar");

    }

    @Override
    public String getName() {
        return getAlias();
    }
}
