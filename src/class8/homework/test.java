package class8.homework;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {

      /*  for (int i = 1; i <=5 ; i++) {
            if (i==1) {
                System.out.println("***   *      *   *");
            } else if (i==5) {
                System.out.println("***   ****   *****");
            }else {
                System.out.println(" *    *      *   *");
            }*/

            Scanner scan=new Scanner(System.in);

            int [] number=new int[5];

            for (int i = 0; i < number.length; i++) {
                number[i]=scan.nextInt()*10;
            }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }

        }




}