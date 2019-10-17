package HomeWorkLesson2.PeopleWithMobile;

public interface Cell {
    void insertSim();

    void callByNumber(String number);

    void getCall(String number);

    void saveNumber(String number);

    void lockPhone();

    void unlockPhone();
}
