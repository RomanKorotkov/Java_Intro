package HomeWorkLesson2.MobileGenerics;

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
