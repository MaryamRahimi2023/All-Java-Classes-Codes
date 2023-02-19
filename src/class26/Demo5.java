package class26;

import java.util.ArrayList;

public class Demo5 {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');

        System.out.println(characters);

        for (Character c:characters) {
            System.out.print(c+" ");

        }

    }
}
