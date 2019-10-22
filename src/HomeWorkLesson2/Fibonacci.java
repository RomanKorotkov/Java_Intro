package HomeWorkLesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbers();

    }

    static void printFibonacciNumbers() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please input number");
            int param = in.nextInt();
            int defoult_param1 = 0;
            int defoult_param2 = 1;

            if (param < 1) {
                System.out.println("Please enter a positive number more than 0");

            } else {
                for (int i = 1; i < param; i = ++i) {
                    int result = defoult_param1 + defoult_param2;
                    defoult_param1 = defoult_param2;
                    defoult_param2 = result;
                    System.out.println(defoult_param1);

                }


            }

        }
    }

}

