package class8.homework;

public class Task6 {
    public static void main(String[] args) {

        /*

        6) Print the following pattern:
         *

         *

         *
         **
         *
         **
         *                    */

        for (int i = 1; i <=9 ; i++) {
            if(i%2!=0) {
                System.out.println("*");
            }else if (i==6 || i==8) {
                System.out.println("**");

            }else if (i%2==0){
                System.out.println(" ");
            }
        }
        System.out.println("_______________________");
        /*
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */

        for (int i = 1; i <=4 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=4 ; i++) {
            for (int j = 0; j <4-i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
