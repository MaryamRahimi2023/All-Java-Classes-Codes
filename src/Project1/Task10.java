package Project1;

public class Task10 {
    public static void main(String[] args) {

/*        10)Write a java program to find the second-largest number in the array? */

        int [] numbers={3,5,6,7,8,1,10,13,114,16,1345,678,320};

        int largest=numbers[0];
        int secondlargest=numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                secondlargest=largest;
                largest=numbers[i];
            } else if (numbers[i]>secondlargest && numbers[i]!=largest) {
                secondlargest=numbers[i];

            }

        }
        System.out.println("The second largest in this array is "+secondlargest);


    }
}
