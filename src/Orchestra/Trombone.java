package Orchestra;

public class Trombone extends BaseInstrumentData {
    public Trombone(String type, String name) {
        super(type, name);
    }

    @Override
    public void tune() {
        System.out.printf("%s was tuned %n", name);
    }

    @Override
    public void play() {
        System.out.printf("%s start sound %n", name);
    }

    @Override
    public void stop() {
        System.out.printf("%s stopped play %n", name);
    }
}
