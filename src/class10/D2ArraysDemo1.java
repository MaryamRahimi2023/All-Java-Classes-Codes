package class10;

import java.util.Arrays;

public class D2ArraysDemo1 {
    public static void main(String[] args) {
                    //colum
                   //  0   1  2
     int [][] matrix={{10,20,30}, // row 0
                      {55,22,45}, // row 1
                      {100,220,450} // row 2
     };
        System.out.println(matrix[1][1]);
        System.out.println(matrix[2][1]);
        System.out.println("***************************************");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {// matrix[0].length first iteration, matrix[1].length,matrix[2].length
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
