package HomeWorkLesson2.CarPark;

public enum Category {
    PASSENGER("Passenger"),
    TRUCK("Truck");

    public String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
