package class27;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

        // remove all the elements from this list which ends with a

       /* for (String s:words) {// normal loops are no able to perform any operations on array which can modify the size of the array
            // loops not are capable enough to perform pereral operations
            if(s.endsWith("a")){
                words.remove(s);// will change the array size
                // Concurrent error
            }

        }
        System.out.println(words);*/

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i); // will not work correct as well
            }// [Cat, Lava, Computer]

        }
        System.out.println(words);
    }
}
