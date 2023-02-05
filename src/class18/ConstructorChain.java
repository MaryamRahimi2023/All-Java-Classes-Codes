package class18;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str){// we cannot make multiple constructor inside same class only if you add parameters you can
     this();// making a call to non argument constructor
        //this();-> Always must be on the first line
        System.out.println(str);
    }
    /*ConstructorChain(int number){// this is also call signature coz different from another constructor
        this("hello");// we should directly enter a String to have this String str here
        System.out.println("This is constructor with int parameter ");
    }*/

    ConstructorChain(String str,int number){// if we want to enter our str value after creating object inside the main method
        this(str);
        System.out.println("This is constructor with int parameter ");
    }

    public static void main(String[] args) {

        //ConstructorChain obj=new ConstructorChain(10);

        //System.out.println("------End of the code------");

        ConstructorChain obj=new ConstructorChain("hello",10);// here we can enter the value of our String str everytime

    }
}
