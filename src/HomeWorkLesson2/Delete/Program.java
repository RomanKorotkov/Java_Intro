package HomeWorkLesson2.Delete;

public class Program {
    public static void main(String []mobile){
        Human  oldman = new Human("AAA", "BBB", 85);
        Human teenager = new Human("FFF", "JJJ", 25);
        SmartPhone xiaomi = new SmartPhone("Xiaomi");
        OldCell nokia = new OldCell("NNN");

        oldman.takeCell(nokia);
        oldman.insertSimCard();
        oldman.unlock();
        oldman.saveNumber("");
        oldman.call("");
        oldman.accept("0932651478");
        oldman.lock();
    }
}
