package lesson03.Lambdas;

public class Helper {
    public static boolean isEven(int i){
        return i%2 ==0;
    }
    public static boolean isOdd(int i){
        return !isEven(i);
    }
}
