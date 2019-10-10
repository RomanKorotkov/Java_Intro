package Farm;

public class Cow extends AnimalParams {

    public Cow(String name, String color, int weight, int height, int length) {
        super(name, color, weight, height, length);
    }

    @Override
    protected String getType() {
        return this.getClass().getSimpleName();
    }
}
