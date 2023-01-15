package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        // 10 20 30 45 50

        int[] numbers={10,20,30,45,50};

        for (int i = 0; i < numbers.length ; i++) {// we say i=0 coz the index start from 0
            System.out.println(numbers[i]);
        }
        System.out.println("_____________________________________________________________");
        int[] numbers1={10,20,30,45,50};
        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {// we say i=0 coz the index start from 0

            sum += numbers[i];
        }System.out.println(sum);
    }
}
