package class20;

public class classTask2 {

    /* Create 1 class with a static method that has 3 overloaded forms.
       Then call each overloaded method with specific arguments and observe result.*/

    static void method(String str1){

        System.out.println("Method with one String");
    }
    static void method(String str1,String str2){

        System.out.println("Method with two String");
    }
    static void method(String str1,String str2,String str3){

        System.out.println("Method with three String");
    }

    public static void main(String[] args) {

        method("Java");// because they are both static and in the same class, so we can call them without name of the class
        // if in a different class I can write the name of the class with method name we do not need the obj for static
        method("Java","C++");
    }
}
