package class7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter a number");// this line will print at least one with a do while loop
            number=scan.nextInt();
        }while (number!=5);


        int number1=0;
        while(number1!=5){
            System.out.println("Please enter a number:");// this line will not print if the condition not meets in while loop
            number1=scan.nextInt();

        }
    }
}
