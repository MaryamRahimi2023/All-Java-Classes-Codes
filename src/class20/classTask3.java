package class20;

public class classTask3 {

    /* Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/

    private void method(String str1){// we can overload any type of methods public private static and other...

        System.out.println("Method with one String");
    }
    private void method(String str1,String str2){

        System.out.println("Method with two String");
    }
    private void method(String str1,String str2,String str3){

        System.out.println("Method with three String");
    }

    public static void main(String[] args) {

        classTask3 obj=new classTask3();

        obj.method("Java");
        obj.method("Java","C++");
        obj.method("Java","Python","C++");
    }


}
