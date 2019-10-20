package HomeWorkLesson2.Tv;

public class Vidik extends BaseDVDPlayer {
    public Vidik(String model) {
        super(model);
    }

    @Override
    public void connection() {
        System.out.printf("DVD player %s was connected to TV %n", getModel());

    }

    @Override
    public void turn_on() {
        System.out.printf("DVD player %s was turned on %n", getModel());

    }

    @Override
    public void turn_off() {
        System.out.printf("DVD player %s was turned off %n", getModel());

    }

    @Override
    public void insertCd() {
        System.out.printf("Cd was inserted into DVD player %n");

    }
}
