package class29.homework;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    /*
      5)Create a collection of integers in which you can keep duplicates.
      Write a logic to find sum of all integers*/

    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(123);
        numbers.add(456);
        numbers.add(789);
        numbers.add(101112);
        numbers.add(121314);

        int sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println(sum);
    }

}
