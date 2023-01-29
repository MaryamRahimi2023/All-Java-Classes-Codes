package class15;

public class MethodPracticeTester {

    public static void main(String[] args) {

        MethodPractice mp = new MethodPractice();// created an object from the method we created

            boolean isEven = mp.isEven(15);// calling the method
            System.out.println(isEven);
            boolean isEven1=mp.isEven(100);//calling method again for 100
            System.out.println(isEven1);
            System.out.println(mp.isEven(100));// shorter way
            System.out.println(mp.isEven(12));
            System.out.println(mp.isEven(20));




        }
    }





