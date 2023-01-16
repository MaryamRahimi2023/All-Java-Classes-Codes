package class8.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /* 4) Write a program to ask a user to enter 5 item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"*/

        // My Way

        Scanner input=new Scanner(System.in);
        double total=0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter an item you would like to purchase: ");
            String Item = input.next();
            System.out.println("Please enter the price of this item:");
            double price = input.nextDouble();
            total=total+price;
            System.out.println("Your Total is " + total);
        }
        System.out.println("Please enter the amount you would like to pay? ");
        double EnteredAmount= input.nextDouble();

        if (EnteredAmount>total) {
            double change = EnteredAmount - total;
            System.out.println("Your change is: " + change);
            System.out.println("Thank you for your shopping");
        } else if (EnteredAmount<total) {
            double due = EnteredAmount-total;
            System.out.println("Amount due "+due);
        }

               /* 1- ask user for the item price and item name
           2- accumulate the price
           3- tell the user how much total that they should pay
           4- if the user given more money program should return a change
           5 Thank you for shopping! */
// Teachers way
/*        Scanner scanner=new Scanner(System.in);

        double total=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total Price amount that you have to pay "+total);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>total){
            double chang=amountPaid-total; // calculating the change
            System.out.println("Hey here is your change "+chang);
        }else if(amountPaid<total) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");*/

    }
}
