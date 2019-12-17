package lesson01.Metallica;

public class TunerTuner extends InstrumentsBase {
    public TunerTuner(String name, String type) {
        super(name, type);
    }

    @Override
    public void turnOn() {
        System.out.printf("Tuner was turned on %n");

    }

    @Override
    public void connectToGuitar() {
        System.out.printf("Tuner was connected to guitar %n");

    }

    @Override
    public void turnOff() {
        System.out.printf("Tuner was turned off %n");

    }

    @Override
    public void takeSticks() {

    }

    @Override
    public void startPlaying() {

    }

    @Override
    public void tuning(String string) {

    }

    @Override
    public void cabelInGuitar() {

    }

    @Override
    public void cabelInCombik() {

    }

    @Override
    public void turnVolume() {

    }

    @Override
    public void turnDistortion() {

    }

    @Override
    public void playing() {

    }

    @Override
    public void singing(/*String lyrics*/) {

    }
}
