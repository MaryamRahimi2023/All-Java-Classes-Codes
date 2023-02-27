package class28;

import java.util.*;

public class Task1 {
    /*
     List<String> aList=new ArrayList<>();
       aList.add("John");
       aList.add("Jane");
       aList.add("James");
       aList.add("Jasmine");
       aList.add("Jane");
       aList.add("James");
       How can you remove all duplicates from ArrayList?
*/
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        // How can you remove all duplicates from ArrayList?

        LinkedHashSet<String> set = new LinkedHashSet<>(aList);
        System.out.println(set);
    }
}
