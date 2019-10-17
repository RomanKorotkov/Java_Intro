package HomeWorkLesson2.PeopleWithMobile;

public class PeopleWithMobiles {
    public static void main(String[] people_with_mobiles) {
        Human laura = new Human("Laura", "Medigan", 85);
        Human brendon = new Human("Brendon", "McClaren", 25);

        ButtonsPhone siemens = new ButtonsPhone("Siemens A50");
        SmartPhone xiaomi = new SmartPhone("Xiaomi REDMI 4");

        laura.getPhone(siemens);
        laura.takePhone();
        laura.insertSim();
        laura.unlockPhone();
        laura.callByNumber("");
        laura.getCall("0932145698");
        laura.saveNumber("0931254147");
        laura.lockPhone();
        System.out.printf("%n");

        brendon.getPhone(xiaomi);
        brendon.takePhone();
        brendon.insertSim();
        brendon.unlockPhone();
        brendon.callByNumber("");
        brendon.getCall("0932145698");
        brendon.saveNumber("0931254147");
        brendon.lockPhone();
        System.out.printf("%n");

        laura.getPhone(xiaomi);
        laura.takePhone();
        laura.insertSim();
        laura.unlockPhone();
        laura.callByNumber("");
        laura.getCall("0932145698");
        laura.saveNumber("0931254147");
        laura.lockPhone();
        System.out.printf("%n");

        brendon.getPhone(siemens);
        brendon.takePhone();
        brendon.insertSim();
        brendon.unlockPhone();
        brendon.callByNumber("");
        brendon.getCall("0932145698");
        brendon.saveNumber("0931254147");
        brendon.lockPhone();
        System.out.printf("%n");


    }
}
