package HomeWorkLesson2;

import java.util.Scanner;

public class WorkWithStrings {
    public static void main(String[] string) {
        eachNth();

    }

    //Variant1
    private static void eachNth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input string");
        String new_string = in.nextLine();
        System.out.println("Please input number");
        int number = in.nextInt();
        char[] chars = new_string.toCharArray();
        for (int i = 0; i < chars.length; i = i + number) {
            System.out.print(chars[i]);
        }


        //Variant2

       /* String miracle = "Miracle";
        int num1 = 2;
        char[] chars2 = miracle.toCharArray();
        for (int i = 0; i < chars2.length; i = i + num1) {
            System.out.print(chars2[i]);

        }*/

    }

}
