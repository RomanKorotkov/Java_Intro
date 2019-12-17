package TESTING;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pr {
    public static void main(String[] args) {
        ArrayList<Peoples> peoples = new ArrayList<>();
        peoples.add(new Peoples("A", 55, Gender.FEMALE));
        peoples.add(new Peoples("B", 60, Gender.MALE));
        peoples.add(new Peoples("R", 70, Gender.MALE));
        peoples.add(new Peoples("U", 45, Gender.FEMALE));
        peoples.add(new Peoples("P", 85, Gender.FEMALE));
        peoples.add(new Peoples("K", 40, Gender.MALE));
        peoples.add(new Peoples("K", 25, Gender.MALE));
        peoples.add(new Peoples("U", 35, Gender.FEMALE));

        peoples.stream().filter(p -> {
            if (p.getGender() == Gender.FEMALE) {
                return p.getAge() >= 55;
            } else {
                return p.getAge() >= 60;
            }

        }).forEach(p -> System.out.printf("%s %s %s - Pensioners %n",p.getName(), p.getAge(), p.getGender()));
        System.out.printf("%n");

        List<Peoples> pensioners = peoples.stream().filter(p ->{
            if (p.getGender() == Gender.FEMALE){
            return p.getAge()>=55;
            } else{
            return p.getAge()>=60;
            }
        }).peek(p ->System.out.printf("%s %s %s - Pensioners %n",p.getName(), p.getAge(), p.getGender())).collect(Collectors.toList());
        System.out.printf("%n");
        pensioners.stream().sorted().forEach(p -> System.out.println(p));
        //pensioners.forEach(System.out::println);
        //System.out.println(pensioners);

    }


    }







