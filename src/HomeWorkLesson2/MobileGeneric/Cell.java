package HomeWorkLesson2.MobileGeneric;

//Interface with phone functionality
public interface Cell {
    //Methods
    void insertSim();

    void callByNumber(String number);

    void getCall(String number);

    void saveNumber(String number);

    void lockPhone();

    void unlockPhone();
}
