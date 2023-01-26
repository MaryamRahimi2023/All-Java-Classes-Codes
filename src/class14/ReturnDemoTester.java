package class14;

public class ReturnDemoTester {

    public static void main(String[] args) {

        ReturnDemo rd=new ReturnDemo();
        String str=rd.method1();
        System.out.println(str);

        int result= rd.method2();// we can store the value in result and print it or reuse it
        System.out.println(result);


    }
}
