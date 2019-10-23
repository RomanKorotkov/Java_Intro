package HomeWorkLesson2.MobileGeneric;

//Main class realisation
public class PeopleWithMobiles {
    public static void main(String[] people_with_mobiles) {

        //Objects - phones
        ButtonsPhone siemens = new ButtonsPhone("Siemens A50");
        SmartPhone xiaomi = new SmartPhone("Xiaomi REDMI 4");

        //Objects - human
        Human<SmartPhone> brendon = new Human("Brendon", "McClaren", 25, xiaomi);
        Human<ButtonsPhone> laura = new Human("Laura", "Lidermann", 25, siemens);

        //Program realisation
        //Actions object brendon with object only xiaomi
        brendon.getphone(xiaomi);
        brendon.takePhone();
        brendon.insertSim();
        brendon.unlockPhone();
        brendon.callByNumber("");
        brendon.getCall("0932145698");
        brendon.saveNumber("0931254147");
        brendon.lockPhone();
        System.out.printf("%n");

        //Actions object laura with object only siemens
        laura.getphone(siemens);
        laura.takePhone();
        laura.insertSim();
        laura.unlockPhone();
        laura.callByNumber("");
        laura.getCall("0932145698");
        laura.saveNumber("0931254147");
        laura.lockPhone();
        System.out.printf("%n");

    }
}
