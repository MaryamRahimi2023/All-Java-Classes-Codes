package class19;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}
class Child extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(name);// referring to my name inside my class not the parent class name
        System.out.println(super.name);
    }
    void hello(){
        System.out.println("Hello method from child class");
    }

    void callingParentMethod(){
        super.hello();// we do not have to add it adds by default if we have only one hello method
              hello();

        // if we have same hello method or same method name here we used super to access the parent class hello
        super.hello();



    }
}