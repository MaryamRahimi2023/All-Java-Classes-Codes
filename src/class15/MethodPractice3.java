package class15;

public class MethodPractice3 {

    // create a method that takes an array of integers sum all the elements from the array and return the sum.

    int arraySum(int [] arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }



}
