package class9;


public class ArraysDemo5 {
    public static void main(String[] args) {

       int [] number=new int[5]; // an empty array of size 5 will be created, 5 is the size we can not store more than 5 number in this array
        System.out.println(number[2]);

        System.out.println("_______________________________________________________");

      int [] array=new int[5]; // an empty array of size 5 will be created, 5 is the size we can note store more than 5 number in this array
        array[0]=50;
        array[1]=30;
        array[2]=55;
        array[3]=60;
        array[4]=52;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


    }
}
