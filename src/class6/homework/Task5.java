package class6.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*  Write a program to find largest of three double values using
        if-else..if and logical operators provided by a user (numbers must be distinct)*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three distinct numbers");

        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        if(number1>number2 && number1>number3){
            System.out.println("The largest number is "+number1);
        } else if (number2>number1 && number2>number3) {
            System.out.println("The largest number is "+number2);
        } else if (number3>number1 && number3>number2) {
            System.out.println("The largest number is "+number3);
        }input.close();


    }
}
