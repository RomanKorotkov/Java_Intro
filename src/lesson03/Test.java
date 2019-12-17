package lesson03;

import HomeWorkLesson2.MobileGeneric.ButtonsPhone;

import java.util.ArrayList;
import java.util.List;

public class Test {
    String n;
    String s;
    int a;

    public Test(String n, String s, int a) {
        this.n = n;
        this.s = s;
        this.a = a;
    }

    public  static void main(String[] args){
        List<Test> persons = new ArrayList<>();
        persons.add(new Test("A", "B", 2));



    }
}
