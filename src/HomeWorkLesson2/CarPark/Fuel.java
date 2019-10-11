package HomeWorkLesson2.CarPark;

public enum Fuel {
    DIESEL("diesel"),
    PETROL("petrol"),
    GAS("gas"),
    ELECTRIC("electricity");

    public String fuel;

    Fuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }
}
