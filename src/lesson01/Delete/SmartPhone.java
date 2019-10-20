package lesson01.Delete;

import java.util.Scanner;

public class SmartPhone extends BaseCell {

    public SmartPhone(String model) {
        super(model);
    }

    @Override
    public void insertSimCard() {
        System.out.println("Standart nano sim-card was inserted into %n" + getCellModel());
    }

    @Override
    public void call(String number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        number = in.nextLine();
        System.out.printf("On cell %s via touchscreen number %s %n", getCellModel(), number);
    }

    @Override
    public void accept(String number) {
        System.out.printf("Cell %s has accept call from %s via swipe up %n", getCellModel(), number);
    }

    @Override
    public void saveNumber(String number) {
        System.out.printf("Cell %s saved %s number on Google %n", getCellModel(), number);
    }

    @Override
    public void lock() {
        System.out.printf("Cell %s was locked by fingerprint on scanner", getCellModel());
    }

    @Override
    public void unlock() {
        System.out.printf("Cell %s was unlocked fingerprint on scanner", getCellModel());
    }

    @Override
    public String toString() {
        return "SmartPhone{}extends" + super.toString();
    }
}
