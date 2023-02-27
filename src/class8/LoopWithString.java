package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your name");

        while (Input.next().equalsIgnoreCase("Sha")){// using string as condition in loop like if you see
            // the name sha print the below codes if not sha do not print
            System.out.println("Great student who always wanted an example with String in loop");
        }
        System.out.println("wrong entry");


    }
}
