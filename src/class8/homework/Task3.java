package class8.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /* 3) Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number to start a range: ");
        int start=scan.nextInt();
        System.out.println("Please enter a number to end a range: ");
        int end= scan.nextInt();
// also can write this way -----> System.out.println("Please Enter two Numbers starting point and ending point");
        int SumEven=0; int SumOdd=0;

        System.out.println("start "+start+" end "+end+" ");

        for (int i = start; i <=end ; i++) {
            if (i%2==0){
                //System.out.println("Even number "+i);
                SumEven+=i;// also can be written like this sumeven=sumeven+i
            }else if (i%2==1){
                SumOdd+=i;// can also be written like this oddsum+=i
                //System.out.println("Odd number "+i);

            }

        }
        System.out.println("Sum of Even numbers: "+SumEven);
        System.out.println("Sum of Odd numbers: "+SumOdd);


    }
}
