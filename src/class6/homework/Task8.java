package class6.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        /*8)HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 distinct numbers");
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        System.out.println("Please enter an operator (+,-,*,/)");
        char operator=scan.next().charAt(0);

        switch (operator){

            case'+':
                System.out.println(number1+number2);
                break;
            case'-':
                System.out.println(number1-number2);
                break;
            case'*':
                System.out.println(number1*number2);
                break;
            case'/':
                System.out.println(number1/number2);
                break;

        }scan.close();




    }
}

