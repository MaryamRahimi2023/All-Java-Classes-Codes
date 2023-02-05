package class4;

import java.util.Scanner;

public class ScannerDemo_1 {
    public static void main(String[] args) {
        // below line helps us the input from the keyboard
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();// nextLine is used when we have to take sentences from the keyboard
        System.out.println(name);
        System.out.println("My name is "+name);


    }
}
