package lesson03.b;

public abstract class Animals {
    protected String alias;
    protected String color;
    protected int height;
    protected int length;
    protected int weight;

    public Animals(String color, int height, int length, int weight) {
        this(null, color, height, length, weight);
    }

    public Animals(String alias, String color, int height, int length, int weight) {
        this.alias = alias;
        this.color = color;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public void run(Speed speed){
        System.out.printf("%s is running %s km/h%n", getType(), speed.getSpeed());
    };
    public void sleep(){
        System.out.printf("%s %s is sleeping %n", getType(), alias);

    }
    public void eat (String food){
        System.out.printf("%s is eating %s %n", getType(), food);
    }

    protected abstract String getType();


    public String getColor() {
        return color;
    }

    public Animals setColor(String color) {
        this.color = color;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Animals setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Animals setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Animals setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public Animals setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;

        if (height != animals.height) return false;
        if (length != animals.length) return false;
        if (weight != animals.weight) return false;
        if (!alias.equals(animals.alias)) return false;
        return color.equals(animals.color);
    }

    @Override
    public int hashCode() {
        int result = alias.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + height;
        result = 31 * result + length;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "alias='" + alias + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}
