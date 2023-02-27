package Project1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

/*      7)Write a java program to check whether a given number is prime or not? */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=scan.nextInt();

        boolean isPrimeNumber=true;
        if (number>1) {
          for (int i = 2; i < number-1; i++) {
             if (number % i == 0) {
                 isPrimeNumber = false;
                 break;
             }
         }

         }else {
         isPrimeNumber=false;

        }
        System.out.println(number+" is a prime number? "+isPrimeNumber);


    }
}
