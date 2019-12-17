package lesson01.Metallica;

import java.util.Scanner;

public class BassWarwick extends InstrumentsBase {
    public BassWarwick(String name, String type) {
        super(name, type);
    }

    @Override
    public void tuning(String string) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Turn the string from 1 to 4 %n");
        string = in.nextLine();
        switch (string) {
            case "1":
                System.out.printf("'E' note is sound %n");
                break;
            case "2":
                System.out.printf("'B' note is sound %n");
                break;
            case "3":
                System.out.printf("'G' note is sound %n");
                break;
            case "4":
                System.out.printf("'D' note is sound %n");
                break;
            default:
                System.out.printf("Guitar is ready");
        }
    }

    @Override
    public void cabelInGuitar() {
        System.out.printf("Cabel was inserted in guitar %s %n", name);

    }

    @Override
    public void cabelInCombik() {
        System.out.printf("Cabel was inserted in kombik %n");

    }

    @Override
    public void turnVolume() {
        System.out.printf("Volume was turned on %n");

    }

    @Override
    public void turnDistortion() {
        System.out.printf("Distortion was turned on %n");

    }

    @Override
    public void playing() {
        System.out.printf("Guitar playing melody %n");

    }

    @Override
    public void takeSticks() {

    }

    @Override
    public void startPlaying() {

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
