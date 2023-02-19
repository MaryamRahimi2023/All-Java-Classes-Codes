package class27;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        // Java will take the data type by default with this var keyword
        // it will not work in java 9 and below

        var name="Computer";
        var c='s';
        var f=12.5;

        // it will work from java 6 to java 19
        Iterator<String> iterator=words.iterator();// return us an obj of type itereter we can use 3 methods

        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);

        // we have a shorter way but, not work in java 7

        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);

    }
}
