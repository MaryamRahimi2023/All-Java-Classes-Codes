package Project1;

public class Task9 {
    public static void main(String[] args) {

/*        9)Maximum and minimum number in the array?  */

        // find the maximum

        int [] numbers={3,5,6,7,8,1,10,13,114,16,1345,678,320};

        int max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("The maximum number in this array is "+max);

        // find the minimum

        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min) {
                min=numbers[i];
            }

        }
        System.out.println("The mininum number in this array is "+min);

    }

}
