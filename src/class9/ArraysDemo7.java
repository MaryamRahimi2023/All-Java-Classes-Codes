package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        double[] arr={10.5,12.0,45,10.5,23,10.5};
        // write a program that can tell us how many times the number 10.5 is present in the array
        int sum=0;
        for (int i = 0; i < arr.length; i++) {// length means we want to go till the last element
            if(arr[i]==10.5){
                sum++;
                System.out.println(arr[i]);
            }

        }
        System.out.println(sum);



    }
}
