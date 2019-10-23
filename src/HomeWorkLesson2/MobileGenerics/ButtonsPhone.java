package HomeWorkLesson2.MobileGenerics;

import java.util.Scanner;

//Class ButtonsPhone include implementation
public class ButtonsPhone extends BaseCell {

    //Super constructor
    public ButtonsPhone(String model) {
        super(model);
    }

    //Getter String model from BaseCell
    public String getModel() {
        return model;
    }

    //Implementation
    @Override
    public void insertSim() {
        System.out.printf("Default sim card was inserted into %s %n", getModel());
    }

    @Override
    public void callByNumber(String number) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please type number and call %n");
        number = in.nextLine();
        System.out.printf("You have called to number - %s %n", number);

    }

    @Override
    public void getCall(String number) {
        System.out.printf("You have got call from number - %s  by 'green' button %n", number);

    }

    @Override
    public void saveNumber(String number) {
        System.out.printf("You have saved number -  %s on sim cart %n", number);

    }

    @Override
    public void lockPhone() {
        System.out.printf("Phone was locked by '*' button %n");

    }

    @Override
    public void unlockPhone() {
        System.out.printf("Phone was unlocked by 'Unlock' button %n");

    }
}
