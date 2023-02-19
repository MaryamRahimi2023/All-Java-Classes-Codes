package class26;

import java.util.ArrayList;

public class Demo8 {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Urwa");
        names.add("Savo");
        names.add("Sam");
        names.add("Abeera");
        names.add("Tarik");

        System.out.println(names); // [Fizzy, Urwa, Savo, Sam, Abeera, Tarik]
        names.clear();
        System.out.println(names);// [] clear everything
    }
}
