package lesson01;

import com.sun.javaws.IconUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MyFirstProgramm {
    public static void main(String[] args) {
        //Calculator();
        //twoNumbers();
        //Equivalent();
        //Equals();
        //Equals2();
        //Bank();
        //Operations();
        //Bank2Circles();
        //Bank2CircleWhile();
        xyzz();
        xyzzz();

    }

    static void Calculator() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("What the operation do you want to do? Please, choose a symbol: + - * /");
            String symbol = in.nextLine();
            if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
                System.out.println("Please, enter the first value");
                int value1 = in.nextInt();
                System.out.println("Please, enter the second value");
                int value2 = in.nextInt();
                switch (symbol) {
                    case "+":
                        System.out.println("Your result is " + (value1 + value2));
                        break;
                    case "-":
                        System.out.println("Your result is " + (value1 - value2));
                        break;
                    case "*":
                        System.out.println("Your result is " + (value1 * value2));
                        break;
                    case "/":
                        System.out.println("Your result is " + (value1 / value2));
                        break;

                }
                //in.close();
            } else {
                System.out.println("Error");
            }
        }

    }

    //Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа. А программа сранивает два
// введенных числа и выводит на консоль результат сравнения (два числа равны, первое число больше второго или первое
// число меньше второго).
    static void twoNumbers() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input first number");
            int first = in.nextInt();
            System.out.println("Input second number");
            int second = in.nextInt();
            if (first > second) {
                System.out.println("First bigger then second");
            } else if (first < second) {
                System.out.println("First smaller then second");
            } else {
                System.out.println("Numbers are equal");
            }
        }

    }
//Решено


    // Напишите консольную программу, в которой пользователь вводит с клавиатуры число. Если число одновременно меньше 9 и
// больше 2, то программа выводит "Число больше 5 и меньше 10". Иначе программа выводит сообщение "Неизвестное число".
    static void Equivalent() {
       /* int first_condition = 9;
        int second_condition = 2;*/
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number between 2 and 9");
        int user_number = in.nextInt();
        if (user_number < 9 && user_number > 2) {
            System.out.println("The number smaller then " + 9 + " and biggest then " + 2);
        } else {
            System.out.println("Unknown number");
        }

    }
//Решено


    //Напишите консольную программу, в которой пользователь вводит с клавиатуры число. Если число либо равно 2, либо равно
// 9, то программа выводит "Число либо равно 2, либо равно 9". Иначе программа выводит сообщение "Неизвестное число".
    //ВАРИАНТ 1
    static void Equals() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input number");
        int user_number = in.nextInt();
        if (user_number == 2 || user_number == 9) {
            switch (user_number) {
                case 2:
                    System.out.println("The number equal to 2");
                    break;
                case 9:
                    System.out.println("The number equal to 9");
                    break;
            }

        } else {
            System.out.println("Unknown number");
        }
    }

    //Решено
    //ВАРИАНТ 2
    static void Equals2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input number");
        int user_number = in.nextInt();
        if (user_number == 2 || user_number == 9) {
            System.out.println("The number equal or to 2 or to 9");
        } else {
            System.out.println("Unknown number");
        }

    }
//Решено

    //В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться. Напишите консольную программу, в
// которую пользователь вводит сумму вклада. Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100
// до 200, то начисляется 7%. Если сумма вклада больше 200, то начисляется 10%. В конце программа должна выводить сумму
// вклада с начисленными процентами.
    static void Bank() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your sum of deposit");
        double sum = in.nextFloat();
        if (sum < 100) {
            sum += sum * 0.05;
        } else if (sum >= 100 && sum < 200) {
            sum += sum * 0.07;
        } else {
            sum += sum * 0.1;
        }
        System.out.println("Your deposit " + sum);

    }
//Решено


    //Напишите консольную программу, которая выводит пользователю сообщение "Введите номер операции: 1.Сложение 2.Вычитание
// 3.Умножение". Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер 2. Пусть
// пользователь вводит в программе номер операции, и в зависимости от этого номера программа выводит название операции.
//Для определения операции по введенному номеру используйте конструкцию switch...case. Если введенное пользователем
// число не соответствует никакой операции (например, число 120), то выведите пользователю сообщение о том, что операция
// неопределена.
    static void Operations() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please input a number of operation: 1.Addition; 2.Subtraction; 3. Multiplication");
            byte symbol = in.nextByte();
            //if (symbol == 1 || symbol == 2 || symbol == 3) {
            switch (symbol) {
                case 1:
                    System.out.println("Your operation is Addition");
                    break;
                case 2:
                    System.out.println("Your operation is Subtraction");
                    break;
                case 3:
                    System.out.println("Your operation is Multiplication");
                    break;
                default:
                    System.out.println("Undefined operation");
            }
        } /*else {
                System.out.println("Undefined operation");
            }*/
    }
//Решено


    //За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу, в которую пользователь
// вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за
// каждый месяц. Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять
// тип float.
//Введите сумму вклада: 100
//Введите срок вклада в месяцах: 1
//После 1 месяцев сумма вклада составит 107,000000
    static void Bank2Circles() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your sum");
        float sum = in.nextFloat();
        System.out.println("Please enter period in months");
        int period = in.nextInt();
        for
        (int i = 1; i <= period; i++) {
            sum += sum * 0.07;
        }
        System.out.println("After " + period + " month(s)" + " your sum will be " + sum);

    }

    //Перепишите предыдущую программу, только вместо цикла for используйте цикл while.
    static void Bank2CircleWhile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your sum");
        float sum = in.nextFloat();
        System.out.println("Please enter period in months");
        int period = in.nextInt();
        int def = 1;
        //int def = period;
        while (def <= period)/*(def > 0)*/ {
            sum += sum * 0.07;
            //System.out.printf("After %d month(s) your sum will be %f", period, sum);
            def++;
            //def--;
        }
        System.out.printf("After %d month(s) your sum will be %f", period, sum);

    }
//Решено


    //В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8
// человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели
// рождаемости и смертности постоянны.
    private static void xyzz() {
        int generation = 10000000;
        int born = 14;
        int dead = 8;
        //int diferance = born - dead;
        for (int i = 0; i <= 10; i++) {
            //generation += generation * diferance / 1000;
            generation += (generation * ((born - dead))) / 1000;
        }
        System.out.println("After 10 years generation will be " + generation);
    }
    //Решено


    //В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
    // смертность - 8 человек. Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год. Рассчитайте,
    // какая численность населения будет через 10 лет, учитывая, что рождаемость не может быть меньше 7 человек на 1000
    // человек, а смертностность не может быть меньше 6 человек на 1000 человек.
    private static void xyzzz() {
        int generation = 10000000;
        int born = 14;
        int dead = 8;
        for (int i = 1; i <= 10; i++) {
            if (born > 7) born -= 1;
            if (dead > 6) dead -= 1;
            generation += generation * (born - dead) / 1000;
        }
        System.out.println("After 10 years generation will be " + generation);
    }
    //Решено

}







