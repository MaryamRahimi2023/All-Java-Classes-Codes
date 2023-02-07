package class19;

public class SuperClass {

    SuperClass(){

        System.out.println("I am a constructor from thr parent class");
    }
}

class SubClass extends SuperClass{

    SubClass(){// if we have no constructor so the java make once by default and call the parent class but only for non parameterized,

        //super();// makes a call to the parent constructor class and always does for first parent direct parents immediate parent
        //System.out.println("I am a child constructor");

        // so we need super keyword mostly for parameterized constructor
         super();
        System.out.println("I am a child constructor");

    }


}