package lesson03.Comparator;

import java.util.Comparator;

public class Comp implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getCompany().toUpperCase().compareTo(o2.getCompany().toUpperCase());
    }
}
