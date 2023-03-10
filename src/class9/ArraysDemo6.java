package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        // create an empty array and store 45 44 33 20 and 10 in it then use a loop to add all the
        // elements which are present in even indexes and print after adding

        int[] numbers=new int [5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {// as per index number= 0,1,2,3,4,5,6,7
            // so the values inside 0,2,4,6 is counted as even
            // sum+=numbers[i] give us the total of all numbers
            if (i%2==0){// only the indexes which are multiple of 2 will process here not the numbers which are multiple of 2
                sum+=numbers[i];
                System.out.println(numbers[i]);
            }
        }System.out.println(sum);

        System.out.println("___________________________________________________");

        // create an array and store 10,20,30,4,5,6,7,80 add all the
        // elements which are multiple of 2

        int Sum=0;
        int [] arr={10,20,30,4,5,6,7,80};
        for (int i = 0; i < arr.length; i++) {
            // sum+=numbers[i] give us the total of all numbers
            if (arr[i]%2==0){// here the inside value of the arrays if multiply by 2 will be added
                Sum+=arr[i];
                System.out.println(arr[i]);
            }
        }System.out.println("Total "+Sum);

    }
}
