package class7.homework;


public class Task3 {
    public static void main(String[] args) {
/*
        Print even numbers from 20 to 1 (2 ways)*/

        for (int i = 20; i > 1 ; i--) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");}
        }
        System.out.println(" ");

        for (int j = 20; j > 1; j-=2) {System.out.print(j+" ");}
    }
}