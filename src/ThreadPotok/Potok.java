package ThreadPotok;

public class Potok implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[]args){
        Thread potok1 = new Thread(new Thread1());
        Thread potok2 = new Thread(new Thread2());
        Thread potok3 = new Thread(new Thread3());
        Thread potok4 = new Thread(() -> System.out.println("Test 4"));

        potok1.setPriority(1);
        potok2.setPriority(5);
        potok3.setPriority(5);
        potok4.setPriority(1);

        potok1.start();
        potok2.start();
        potok3.start();
        potok4.start();
    }
}
