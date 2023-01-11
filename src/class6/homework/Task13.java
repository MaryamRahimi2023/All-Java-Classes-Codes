package class6.homework;


public class Task13 {
    public static void main(String[] args) {
/*
        Print odd numbers between 20 and 50 (2 ways)*/

        int number=20;

        while(number<50){
            if(number%2==1)
            System.out.println(number+" ");
            number++;
            }
        System.out.println("");
        int number1=21;
        while (number1<50) {
            System.out.println(number1);
            number1+=2;
        }
    }
}