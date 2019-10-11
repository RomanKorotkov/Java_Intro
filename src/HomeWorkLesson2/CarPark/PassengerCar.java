package HomeWorkLesson2.CarPark;

public class PassengerCar extends CarParams {
    public PassengerCar(String name, int power, int max_speed, int length, int weight, int height) {
        super(name, power, max_speed, length, weight, height);
    }

    @Override
    protected String getType() {
        return this.getClass().getSimpleName();
    }
}
