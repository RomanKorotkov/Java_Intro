package Farm;

public enum Run {
    MEDIUM(40),
    FAST(88),
    SLOW(10);

    public int speed;

    Run(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
