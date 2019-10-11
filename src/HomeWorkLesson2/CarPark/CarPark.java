package HomeWorkLesson2.CarPark;

public class CarPark {
    public static void main(String[] cars) {
        PassengerCar citroen = new PassengerCar("'Citroen'", 90, 165, 4380, 1810, 1801);
        PassengerCar tesla = new PassengerCar("'Tesla'", 258, 225, 4694, 1849, 1443);
        TruckCar gaz = new TruckCar("'GAZ-2790'", "van", 98, 115, 5480, 2380, 2120);
        TruckCar zil = new TruckCar("'ZIL 131'", "van", 150, 80, 7040, 2500, 2975);

        citroen.introduction();
        citroen.information();
        citroen.category(Category.PASSENGER);
        citroen.fuel(Fuel.DIESEL);
        citroen.seats(5);
        citroen.startEngine();
        citroen.go();
        citroen.stop();

        tesla.information();
        tesla.category(Category.PASSENGER);
        tesla.fuel(Fuel.ELECTRIC);
        tesla.seats(4);
        tesla.startEngine();
        tesla.go();
        tesla.stop();

        gaz.information();
        gaz.category(Category.TRUCK);
        gaz.body();
        gaz.fuel(Fuel.GAS);
        gaz.startEngine();
        gaz.go();
        gaz.stop();

        zil.information();
        zil.category(Category.TRUCK);
        zil.body();
        zil.fuel(Fuel.PETROL);
        zil.startEngine();
        zil.go();
        zil.stop();

    }
}
