package class4.homework;

import java.util.Scanner;

public class AnnualSalary {
    public static void main(String[] args) {

        // Write a program to ask user to enter numbers of worked years and annual salary.
        // If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
        // Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of years you have served.");
        int yearsOfWork= scan.nextInt();

        if (yearsOfWork>5) {
            System.out.println("Please enter the amount of your salary. ");
            int salary= scan.nextInt();
            System.out.println("You are eligible for bonus");
            if (salary > 50000) {
            System.out.println("you are bonus is 5000");
        }else{
                System.out.println("your bonus is 3000");}
        }else {
            System.out.println(" You are not eligible for bonus ");
        }
    }
}
