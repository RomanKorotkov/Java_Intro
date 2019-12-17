package lesson01.Metallica;

public class DrumsTama extends InstrumentsBase{
    public DrumsTama(String name, String type) {
        super(name, type);
    }

    @Override
    public void takeSticks() {
        System.out.printf("Sticks in the hands %n");

    }

    @Override
    public void startPlaying() {
        System.out.printf("Drums playing rhythm %n");

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

    @Override
    public void turnOn() {

    }

    @Override
    public void connectToGuitar() {

    }

    @Override
    public void turnOff() {

    }
}
