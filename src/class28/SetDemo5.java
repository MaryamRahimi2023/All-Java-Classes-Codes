package class28;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);

        // Write some logic to remove duplicates from above list
        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>(numbers);// passing the needed list here
        System.out.println(uniqueNumbers);// 99% used when we need to remove duplicates

    }
}
