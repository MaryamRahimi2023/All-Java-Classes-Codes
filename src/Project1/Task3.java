package Project1;

public class Task3 {
    public static void main(String[] args) {

/*        3) Create a 2D array of integer values. Print the sum of all numbers.  */

        int [][] integers={{3,4,5,6},
                           {6,7,8,9},
                           {12,13,15,17}
        };

        int sum=0;

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                sum+=integers[i][j];

            }

        }
        System.out.println(sum);

        // 2nd way

        int sum1=0;
        for (int [] nums:integers) {
            for (int num:nums) {
                sum1+=num;
            }

        }
        System.out.println(sum1);

    }
}
