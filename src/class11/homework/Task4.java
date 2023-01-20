package class11.homework;

public class Task4 {

    public static void main(String[] args) {

        /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers. */

        int [][] numbers={{3,4,6},{7,8,9},{20,60,50}};

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
