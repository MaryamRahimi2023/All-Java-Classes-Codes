package class9.homework;

public class Task5 {
    public static void main(String[] args) {

        /* 5) Create an array of size 5 on integers and calculate the sum of all elements in an array.*/

        int[] numbers={25,35,45,55,65,75};

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        System.out.println(sum);


    }
}
