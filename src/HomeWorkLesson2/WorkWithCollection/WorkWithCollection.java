package HomeWorkLesson2.WorkWithCollection;

import java.util.*;
//Pushkin
public class WorkWithCollection {
    public static void main(String[] list) {
        //Implementation
        List<String> poems = new ArrayList<>(Arrays.asList());
        poems.add("My uncle, of the best traditions");
        poems.add("When being almost deceased");
        poems.add("Forced men to treat him with distinction");
        poems.add("Which was the best of his ideas.");
        poems.add("Hasta la vista, baby");
        poems.add("Ba-ba-h");

        //Show Strings
        System.out.println(poems);
        System.out.printf("%n");

        //Remove value
        poems.remove(new String("Hasta la vista, baby"));

        //Remove index
        poems.remove(4);

        //Iterator of strings before sorting
        Iterator before_sort = poems.iterator();
        while(before_sort.hasNext()) {
            System.out.println(before_sort.next());
        }
        System.out.printf("%n");

        //Sort by alphabetical
        Collections.sort(poems);
        System.out.println(poems);
        System.out.printf("%n");

        //Reverse alphabetical sort and show with iterator
        Collections.reverse(poems);
        Iterator after_sort = poems.iterator();
        while(after_sort.hasNext()) {
            System.out.println(after_sort.next());
        }
    }
}
