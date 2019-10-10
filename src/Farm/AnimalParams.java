package Farm;

abstract class AnimalParams {
    String name;
    String color;
    int weight;
    int height;
    int length;
    private static int count = 0;

    public AnimalParams(String name, String color, int weight, int height, int length) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.length = length;
        count++;
    }

    protected abstract String getType();

    private static int getCount() {
        return count;
    }

    public void information() {
        System.out.printf("Hello, this is our farm. In our farm live %s animal(s) %n", getCount());
    }

    public void introduction() {
        System.out.printf("Let's start to introduce our %s %s %n", getType(), name);
        System.out.printf("%s has the next parameters: color -  %s, weight -  %s, height -  %s, length -  %s %n", name,
                color, weight, height, length);
    }

    public void running(Run speed) {
        System.out.printf("%s can running %s k/h %n", getType(), speed.getSpeed());
    }

    public void voice(Voice sound) {
        System.out.printf("%s make the sound as %s %n", getType(), sound.getSound());
    }

    public void food(String food) {
        System.out.printf("And of course our %s love to eat %s %n", name, food);
    }

    @Override
    public String toString() {
        return "AnimalParams{" +
                "name='" + name + '\'' +
                ", color - " + color +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    public String getName() {
        return name;
    }

    public AnimalParams setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public AnimalParams setColor(String color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public AnimalParams setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public AnimalParams setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getLength() {
        return length;
    }

    public AnimalParams setLength(int length) {
        this.length = length;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalParams that = (AnimalParams) o;

        if (weight != that.weight) return false;
        if (height != that.height) return false;
        if (length != that.length) return false;
        if (count != that.count) return false;
        if (!name.equals(that.name)) return false;
        return color.equals(that.color);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + weight;
        result = 31 * result + height;
        result = 31 * result + length;
        result = 31 * result + count;
        return result;
    }
}
