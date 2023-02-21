package class27.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {

    /* 5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }

        System.out.println(numbers);
        numbers.removeIf(n-> n%5==0);
        System.out.println(numbers);

        // 2nd way

        Iterator<Integer> checker=numbers.iterator();
        while (checker.hasNext()){
            Integer n=checker.next();
            if(n%5==0){
                checker.remove();
            }
        }
        System.out.println(numbers);

    }

}
