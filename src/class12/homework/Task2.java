package class12.homework;

public class Task2 {

    public static void main(String[] args) {

        /* 2) Create a String and print it in reverse order (Sunday → yadnuS). */

        String str="Sunday";
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i)+" ");
        }

        //2nd way

        String str1="Sunday";
        StringBuilder sb=new StringBuilder(str);// object of the class

        System.out.println(sb.reverse().toString());





    }
}
