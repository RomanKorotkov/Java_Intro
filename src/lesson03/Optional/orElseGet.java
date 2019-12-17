package lesson03.Optional;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

public class orElseGet {
    static <T> T orElseGet(Optional<T> o, Supplier<T> p) {
        if (o.isPresent()){
            return o.get();
        } else{
            return p.get();
        }
    }
    public static void main(String[]args){
        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(new Integer[]{}));
        Optional<Integer> orelseget = test.stream().max(Integer::compare);

        System.out.println(orElseGet(orelseget, () -> -1000));
    }
}
