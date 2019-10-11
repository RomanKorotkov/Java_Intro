package HomeWorkLesson2.CarPark;

public class TruckCar extends CarParams {

    public TruckCar(String name, String body, int power, int max_speed, int length, int weight, int height) {
        super(name, body, power, max_speed, length, weight, height);
    }

    @Override
    protected String getType() {
        return this.getClass().getSimpleName();
    }


}
