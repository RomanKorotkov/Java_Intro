package HomeWorkLesson2.MobileGenerics;

import java.util.Scanner;

//Class SmartPhone include implementation
public class SmartPhone extends BaseCell {

    //Super constructor
    public SmartPhone(String model) {
        super(model);
    }

    //Getter model from BaseCell
    public String getModel() {
        return model;
    }

    //Implementation
    @Override
    public void insertSim() {
        System.out.printf("Nano sim card was inserted into %s %n", getModel());
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
        System.out.printf("You have got call from number - %s by 'swipe right' action %n", number);

    }

    @Override
    public void saveNumber(String number) {
        System.out.printf("You have saved number - %s on a Google account %n", number);

    }

    @Override
    public void lockPhone() {
        System.out.printf("Phone was locked by 'border' button %n");

    }

    @Override
    public void unlockPhone() {
        System.out.printf("Phone was unlocked by 'swipe up' action %n");

    }
}
