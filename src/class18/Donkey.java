package class18;

public class Donkey {

    String name;
    int age;
    double weight;


   /* Donkey(){// we need to create the constructor by class name
        System.out.println("This is non argument constructor");
    }*/

    /*Donkey(String donName, int donAge){

        name=donName;
        age=donAge;

        Donkey's name is Khar age is 27
    }*/

    /*Donkey(String name, int age){// parameters names same as variables then Donkey's name is null age is 0
    // instance variable name=name; // local variable
                         age=age;
    }*/

    Donkey(String name, int age){// this keyword is used to refers to the current instance variables or object Donkey's name is Khar age is 27
        this.name=name;// in situation when local variable have same name as instance we use this to differentiate and refer to instance variables
        this.age=age;
    }

    void print(){

        System.out.println("Donkey's name is "+name+" age is "+age);
    }

    public static void main(String[] args) {

        /*Donkey obj=new Donkey();// this is a non argument constructor without parameters usually the default is non argument always.
        // default constructor created by the compiler when a programmer does not create one himself
        // we are making a call to the constructor here so constructor will be executed
        // This is non argument constructor*/

        /*obj.print();// this is a call to method
        Donkey's name is null age is 0*/

        Donkey obj=new Donkey("Khar",27);// the moment we create a constructor with parameters compiler does not give any default constructor
        // Donkey class name
        //obj is a reference name (can be anything related)
        //new keyword creates  objects ( we can create multiple objects for the same constructor and this keyword then will refer to the new object variables.
        // calling a constructor
        // initialization of values (sequence is matter should be as it is assigned in constructor)
        //printing via print void method after creating constructor in Donkey class and initialize parameters to it
        obj.print();// Donkey's name is Khar age is 27


    }
}
