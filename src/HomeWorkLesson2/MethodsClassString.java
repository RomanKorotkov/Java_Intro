package HomeWorkLesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodsClassString {
    public static void main(String[] string) {
        charAt();
        concat();
        endsWith();
        booleanEquals();
        booleanEqualsIgnoreCase();
        indexOf();
        lastIndexOf();
        intLength();
        replace();
        split();
        startsWith();
        substring();
        charArray();
        lowerCase();
        upperCase();
        trim();
    }

    //Method charAt()
    private static void charAt() {
        String magic = "Abra-ka-dabra";
        char symbol = magic.charAt(5);
        System.out.println("The sixth symbol is " + "'" + symbol + "'");
    }

    //Method concat()
    private static void concat() {
        String hello = "Hello, my dear";
        hello = hello.concat(" friend");
        System.out.println(hello);
    }

    //Method endsWith()
    private static void endsWith() {
        String lorem = "Lorem ipsum dolor sit amet";
        boolean check;
        check = lorem.endsWith("amet");
        System.out.println("Is the amet last word? " + check);
        check = lorem.endsWith("sit");
        System.out.println("Is the sit last word? " + check);

    }

    //Method  boolean equals()
    private static void booleanEquals() {
        String lorem = "Lorem ipsum dolor sit amet";
        String lorem2 = "Amet sit dolor imsum lorem";
        String lorem3 = lorem;
        boolean check;
        check = lorem.equals(lorem2);
        System.out.println("lorem is equal to lorem2? " + check);
        check = lorem.equals(lorem3);
        System.out.println("lorem is equal to lorem3? " + check);
    }

    //Method boolean equalsIgnoreCase()
    private static void booleanEqualsIgnoreCase() {
        String lorem = "Lorem ipsum dolor sit amet";
        String lorem2 = "LOREM IPSUM DOLOR SIT AMET";
        String lorem3 = "Lorem ipsum dolor sit";
        boolean check;
        check = lorem.equalsIgnoreCase(lorem2);
        System.out.println("lorem is equal to lorem2? " + check);
        check = lorem.equalsIgnoreCase(lorem3);
        System.out.println("lorem is equal to lorem3? " + check);

    }

    //Method indexOf(int ch)
    private static void indexOf() {
        String lorem = "Lorem ipsum dolor sit amet";
        String lorem2 = new String("ipsum");
        String lorem3 = new String("lalala");
        System.out.println("Index 'r' from lorem is " + lorem.indexOf('r'));
        System.out.println("Index lorem2 is " + lorem.indexOf(lorem2));
        System.out.println("Index lorem3 is " + lorem.indexOf(lorem3));
    }

    //Method lastIndexOf()
    private static void lastIndexOf() {
        String lorem = "Lorem ipsum dolor sit amet";
        String lorem2 = new String("dolor");
        String lorem3 = new String("lalala");
        System.out.println("Index 's' from lorem is " + lorem.lastIndexOf('s'));
        System.out.println("Index lorem2 is " + lorem.lastIndexOf(lorem2));
        System.out.println("Index lorem3 is " + lorem.lastIndexOf(lorem3));
    }

    //Method int length()
    private static void intLength() {
        String lorem = "Lorem ipsum dolor sit amet";
        System.out.println("Length of lorem is " + lorem.length());
    }

    //Method String replace()
    private static void replace() {
        String hello = "Hello my dear";
        System.out.println(hello.replace('d', 'b'));
    }

    //Method String split
    private static void split() {
        String question = "Hello my not dear friend, are you ready?";
        for (String question2 : question.split("not")) {
            System.out.println(question2);
        }

    }

    //Method startsWith
    private static void startsWith() {
        String start = "Let's start to write a code";
        System.out.println("String started from 'Let's'? " + start.startsWith("Let's"));
        System.out.println("String started from 'start' if index '6'? " + start.startsWith("start", 6));
        System.out.println("String started from 'start'? " + start.startsWith("start"));
    }

    //Method substring
    private static void substring() {
        String topic = "This topic very interesting for me";
        System.out.println(topic.substring(16));
        System.out.println(topic.substring(1, 10));
    }

    //Method char Array()
    private static void charArray() {
        String lorem = "Lorem ipsum dolor sit amet";
        System.out.println(lorem.toCharArray());

    }

    //Method toLowerCase()
    private static void lowerCase() {
        String lorem = "LOREM IPSUM DOLOR SIT AMET";
        System.out.println(lorem.toLowerCase());
    }

    //Method toUpperCase
    private static void upperCase() {
        String name = "gabriel";
        System.out.println(name.toUpperCase());
    }

    //Method trim()
    private static void trim() {
        String hello = "               Hello my very dear friend                 ";
        System.out.println("String: " + hello.trim());
    }


}
