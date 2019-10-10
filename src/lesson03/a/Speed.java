package lesson03.a;

public enum Speed {
    SLOW(2),
    MEDIUM(5),
    FAST(20);

    private final int speed;

    Speed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
