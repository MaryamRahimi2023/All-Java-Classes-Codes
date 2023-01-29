package class15;

public class MethodPractice2Tester {

    // create a method that takes a String reverse it and return the reversed String.
    // call the method reverseStr

    public static void main(String[] args) {

        MethodPractice2 mp=new MethodPractice2();

        String reverseStr=mp.reverseStr("Sunday");
        System.out.println(reverseStr);
        System.out.println(mp.reverseStr("Sunday"));// shorter way

    }
}
