package class7.homework;


public class Task4 {
    public static void main(String[] args) {
/*
        Print odd numbers between 20 and 50 (2 ways)*/

        for (int i = 20; i < 50; i++) {
            if(i%2==1){
                System.out.print(i+" ");}
        }

        System.out.println(" ");

        for (int i = 21; i < 50; i+=2) {
            System.out.print(i+" ");

        }
    }
}