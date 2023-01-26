package class14;

import java.util.Arrays;

public class MethodDemo1 {
    public static void main(String[] args) {

        int [] arr1={10,20,30,45,50};

        int sum=0;
        for (int number:arr1){
            sum+=number;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr1));

        int sum2=0;
        int [] arr2={10,10,30,45,50};
        for (int number1:arr2) {
            sum2+=number1;
        }
        System.out.println(sum2);

        int sum3=0;
        int [] arr3={10,20,10,45,50};
        for (int number3:arr3) {
            sum3+=number3;
        }
        System.out.println(sum3);



    }
}
