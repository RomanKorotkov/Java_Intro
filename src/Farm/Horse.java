package Farm;

public class Horse extends AnimalParams {

    public Horse(String name, String color, int weight, int height, int length) {
        super(name, color, weight, height, length);
    }

    @Override
    protected String getType() {
        return this.getClass().getSimpleName();
    }


}
