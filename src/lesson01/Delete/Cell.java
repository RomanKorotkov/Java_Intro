package lesson01.Delete;

public interface Cell {
    void insertSimCard();
    void call(String number);
    void accept(String number);
    void saveNumber(String number);
    void lock();
    void unlock();

    String getCellModel();
}
