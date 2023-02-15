package class7;

import java.util.Scanner;

public class ForWhileLoop {
    public static void main(String[] args) {
        // prints number from 0-9

        int number=0;

        while(number<10){
            System.out.print(number+" ");
        number++;
        }


        System.out.println("*************************************");

        /* (initialize ; condition ; increment or decrement)*/

        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println("*************************************");


        // prints odd number from 1-20

        /*for(int n=1; n<20; n+=2){
            System.out.print(n+" ");}

        System.out.println("*************************************");
         // 2nd way

         for(int m=0; m<20; m++) {
             if (m % 2 != 0) {
                 System.out.print(m+" ");
             }
         }
*/

        }
}
