package class15;

public class MethodPractice3Tester {

    // create a method that takes an array of integers sum all the elements from the array and return the sum.
    public static void main(String[] args) {

    MethodPractice3 mp=new MethodPractice3();
        System.out.println(mp.arraySum(new int[]{10,20,30}));// short way
        int [] array={10,20,30};
        System.out.println(mp.arraySum(array));


    }

}
