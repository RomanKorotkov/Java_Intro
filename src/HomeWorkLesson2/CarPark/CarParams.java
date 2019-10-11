package HomeWorkLesson2.CarPark;

abstract class CarParams {
    String name;
    String body;
    int power;
    int max_speed;
    int length;
    int weight;
    int height;
    public static int count = 0;

    public CarParams(String name, int power, int max_speed, int length, int weight, int height) {
        this.name = name;
        this.power = power;
        this.max_speed = max_speed;
        this.length = length;
        this.weight = weight;
        this.height = height;
        count++;
    }

    public CarParams(String name, String body, int power, int max_speed, int length, int weight, int height) {
        this.name = name;
        this.body = body;
        this.power = power;
        this.max_speed = max_speed;
        this.length = length;
        this.weight = weight;
        this.height = height;
        count++;
    }

    protected abstract String getType();

    public static int getCount() {
        return count;
    }

    public void introduction() {
        System.out.printf("Hello, dear friends. We want to introduce our car park. In our park available %s car(s) %n",
                getCount());
    }

    public void information() {
        System.out.printf("We want to present %s %n", name);

    }

    public void category(Category category) {
        System.out.printf("This is %s car category %n", category.getCategory());
        System.out.printf("This car has the next parameters: power - %s, max speed - %s, length - %s, weight - %s, " +
                " height - %s %n", power, max_speed, length, weight, height);

    }

    public void body() {
        System.out.printf("%s has %s type of body %n", name, body);
    }


    public void fuel(Fuel fuel) {
        System.out.printf("Engine of %s use %s %n", name, fuel.getFuel());
    }

    public void seats(int seats) {
        System.out.printf("%s has %s seats %n", name, seats);
    }

    public void startEngine() {
        System.out.printf("Let's start our test drive %n");
        System.out.printf("%s started the engine %n", name);
    }

    public void go() {
        System.out.printf("%s goes %n", name);
    }

    public void stop() {
        System.out.printf("%s stoped %n", name);
    }


    @Override
    public String toString() {
        return "CarParams{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", power=" + power +
                ", max_speed=" + max_speed +
                ", length=" + length +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public CarParams setName(String name) {
        this.name = name;
        return this;
    }

    public String getBody() {
        return body;
    }

    public CarParams setBody(String body) {
        this.body = body;
        return this;
    }

    public int getPower() {
        return power;
    }

    public CarParams setPower(int power) {
        this.power = power;
        return this;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public CarParams setMax_speed(int max_speed) {
        this.max_speed = max_speed;
        return this;
    }

    public int getLength() {
        return length;
    }

    public CarParams setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public CarParams setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public CarParams setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarParams carParams = (CarParams) o;

        if (power != carParams.power) return false;
        if (max_speed != carParams.max_speed) return false;
        if (length != carParams.length) return false;
        if (weight != carParams.weight) return false;
        if (height != carParams.height) return false;
        if (count != carParams.count) return false;
        if (!name.equals(carParams.name)) return false;
        return body.equals(carParams.body);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + body.hashCode();
        result = 31 * result + power;
        result = 31 * result + max_speed;
        result = 31 * result + length;
        result = 31 * result + weight;
        result = 31 * result + height;
        result = 31 * result + count;
        return result;
    }
}
