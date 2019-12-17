package lesson03.Lambdas;

public class LambdasProgram {
    public static void main(String[] lam){
        int[] arr = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        Expression<Integer> exp1 = integer -> integer > 0;
        Expression<Integer> exp2 = Helper::isEven;

        System.out.println(sum(arr, exp1));
        System.out.println(sum(arr, exp2));
        System.out.println(sum(arr, integer -> integer<0));
        System.out.println(sum(arr, Helper::isOdd));
        System.out.println(sum(arr, integer -> integer>=3));
    }
    public static int sum(int[] arr, Expression<Integer> exp){
        int result = 0;
        for(int element : arr){
            if(exp.isEqual(element)){
                result += element;
            }
        }
        return result;
    }
}
