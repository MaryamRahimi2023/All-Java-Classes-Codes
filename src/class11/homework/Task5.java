package class11.homework;

public class Task5 {

    public static void main(String[] args) {

        /* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
        */

        int [][] numbers={{150,421,55,20},
                          {10,133,501,76},
                          {120,130,155,99},
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }
            }
            System.out.println();
        }

    }
}
