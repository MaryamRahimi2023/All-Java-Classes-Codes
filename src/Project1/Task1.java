package Project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

/*        1)Using Scanner create an array of integer values. After the array is created,
           calculate the sum of all stored elements in that array. */

        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");

        int size= scan.nextInt();
        int [] arr=new int[size];

        int sum=0;
        System.out.println("Please enter "+size+" numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
            sum+=arr[i];

        }
        System.out.println("The sum of the numbers you have entered is "+sum);

    }
}
