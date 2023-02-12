package class6.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /* Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
        any day from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter day number");
        int day= scan.nextInt();

         if(day>=1 && day<=5){
             System.out.println("Weekday");
         } else if (day==6 || day==7) {
             System.out.println("Weekend");
         }else {
             System.out.println("Invalid day");
         }

        int day1=6;
        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }

    }
}
