package class26;

import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Urwa");
        names.add("Savo");
        names.add("Sam");
        names.add("Abeera");
        names.add("Tarik");

        System.out.println(names.contains("Daria"));

        // we can not remove elements in Array, but we can do it in ArrayList

        System.out.println(names);
        //System.out.println(names.remove(2));
        names.remove("Sam");
        System.out.println(names);// automatically shrinking and the other
        // elements will take this elements index

        // method to replace an element in Array list

        names.set(4,"Sam");
        System.out.println(names);

        // to find the index of an elements from an Arraylist
        // like we have a long list and want to find the index of an element

        System.out.println(names.indexOf("Savo"));



    }
}
