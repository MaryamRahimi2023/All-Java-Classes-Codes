package Project1;

public class Test {
    public static void main(String[] args) {

        int[][] array = {{-1, 2, -3}, {4, -5, 6}, {-7, 8, -9}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0 && array[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of negative and odd elements: " + count);

    }
}