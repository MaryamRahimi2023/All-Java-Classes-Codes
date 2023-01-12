package class6.homework;


public class Task12 {
    public static void main(String[] args) {
/*
        Print even numbers from 20 to 1 (2 ways)*/

        int number=20;

        while(number>=1){
            if(number%2==0)
            System.out.print(number+" ");
            number-=1;
            }
        System.out.println("********");
        int number1=20;
        while (number1>=1) {
            System.out.print(number1+" ");
            number1-=2;
        }
    }
}