package class9;

public class ArraysDemo5 {
    public static void main(String[] args) {

       int [] number=new int[5]; // an empty array of size 5 will be created, 5 is the size we can note store more than 5 number in this array
        System.out.println(number[2]);

        System.out.println("_______________________________________________________");

        int [] number1=new int[5]; // an empty array of size 5 will be created, 5 is the size we can note store more than 5 number in this array
        number1[0]=50;
        number1[1]=30;
        number1[2]=55;
        number1[3]=60;
        number1[4]=52;

        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i]);

        }


    }
}
