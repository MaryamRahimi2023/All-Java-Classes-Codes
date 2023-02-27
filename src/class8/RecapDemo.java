package class8;

import java.util.Scanner;

public class RecapDemo {
    public static void main(String[] args) {
        // 10 8 6 4 2
        int number=10;

        while (number>=2){
        System.out.println(number);
        number-=2;}
        System.out.println("*********");

        int number1=10;

        do {
            System.out.println(number1);
        number1=number1-2; // same as number-=2
        }while (number1>=2);

        for (int i = 10; i >=2 ; i-=2) {
            System.out.println(i);}

            // example from Repil

            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter the number");
            int number3= scan.nextInt();

            for (int j = 0; j < number3; j++) {
                System.out.print(j+" ");
            } System.out.println();// print in next line

        }

    }

