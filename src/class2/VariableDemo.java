package class2;

public class VariableDemo {
    public static void main(String[] args) {

        int numberBox=10; // we don't need to define the data type again and again  java remembers it.
        numberBox=20;// we are reassigning number 20 to numberBox, so it will overwrite 10 with 20.
        System.out.println(numberBox); // java will take the last data if we write 2 values, less memory and work for computers.
        System.out.println(numberBox);// we are reusing the same box again and again.
        numberBox=200;
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox);

        System.out.println("*************");

        int number=20;
        int number2=20;
        int number3=20;
        int number4=20;
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);
        // instead of writing 20 4 times we can write 20 one time and use it 4 times.
        System.out.println("*************");
        System.out.println(number*1);
        System.out.println(number2*2);
        System.out.println(number3*3);
        System.out.println(number4*4);


    }
}
