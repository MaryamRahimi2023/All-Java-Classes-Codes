package class8.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /* 4) Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an item you would like to purchase: ");
        String Item=input.next();
        System.out.println("Please enter the price of this item:");
        double price= input.nextDouble();
        System.out.println("Your Total is "+price);

        while (price>0){
            System.out.println("Please enter the amount you would like to pay? ");
            double EnteredAmount= input.nextDouble();
            price-=EnteredAmount;

            if(price>0){
                System.out.println("Amount Due: "+price);
                break;
            }else {
                System.out.println("Your change is: " +price);
                System.out.println("Thank you for your shopping");
            }
        }

    }
}
