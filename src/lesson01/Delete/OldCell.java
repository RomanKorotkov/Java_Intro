package lesson01.Delete;

import java.util.Scanner;

public class OldCell extends BaseCell{

    public OldCell(String model) {
        super(model);
    }

    @Override
    public void insertSimCard() {
        System.out.println("Standart sim-card was inserted into" + getCellModel());
    }

    @Override
    public void call(String number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        number = in.nextLine();
        System.out.printf("On cell %s type number %s %n", getCellModel(), number);
    }

    @Override
    public void accept(String number) {
        System.out.printf("Cell %s has accept call from %s via green button %n", getCellModel(), number);
    }

    @Override
    public void saveNumber(String number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        number = in.nextLine();
        System.out.printf("Cell %s saved %s number on sim card %n", getCellModel(), number);
    }

    @Override
    public void lock() {
        System.out.printf("Cell %s was locked by '*' button %n", getCellModel());
    }

    @Override
    public void unlock() {
        System.out.printf("Cell %s was unlocked by 'Unlock' button %n", getCellModel());
    }

    @Override
    public String toString() {
        return "OldCell{}extends" + super.toString();
    }
}
