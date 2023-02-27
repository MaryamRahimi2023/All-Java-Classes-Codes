package class29.homework;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {

    /*
      4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
      Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {


        Set<String> words = new LinkedHashSet<>();
        words.add("Today");
        words.add("is");
        words.add("a");
        words.add("Sunny");
        words.add("Today");
        words.add("day");
        words.add("a");
        words.add("is");

        String allWords="";// to concatenate all string to one string
        for (String word : words) {
            allWords+=" "+word;

            // System.out.print(word+" ");// to print by words
        }
        System.out.print(allWords);

    }

}
