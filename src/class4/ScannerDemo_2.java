package class4;

import java.util.Scanner;

public class ScannerDemo_2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your ege");
        int age=input.nextInt();// this is called method
        System.out.println("You are "+age+" years old");

        Scanner input1= new Scanner(System.in);
        System.out.println("Are you Ready for Holidays");
        boolean ready=input.nextBoolean();
        System.out.println("we are ready "+ready);






    }
}
