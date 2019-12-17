package lesson03.ExeptionsErrors;

public class ExceptionProgram {
    public static void main (String[] exeption){
        sleep(300);
    }

    public static void sleep(long timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepWithRethrowing(long timeout) throws InterruptedException {
        Thread.sleep(timeout);
    }
}
