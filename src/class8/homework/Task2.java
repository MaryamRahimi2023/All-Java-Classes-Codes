package class8.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 2) Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.

        Scanner scan=new Scanner(System.in);


        for (int Ask = 0; Ask < 10 ; Ask++) {// we use for loop coz we know in advance how many times we want to print
            System.out.println("Would you like to apply for credit card?");
            String answer=scan.nextLine();
            if(answer.equalsIgnoreCase("yes")) {
                break;
            }

       }
    }
}
