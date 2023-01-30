package class15;

public class Dog {

    String name; // instance variables, inside class outside the methods, will be saved in the memory for a longer time
    String breed;
    String color;

    static int noOfLegs=4; // static variable, have the word of static with them inside the class outside the method

    void printFood(){
        System.out.println(name);
        String food="Meat";// local variable// inside the class and method, they will destroy soon after executing the codes,
        // we save memory if we use local variables
        System.out.println(food);
    }
    void printColor(){
        System.out.println(name);// big scope of usage
        // System.out.println(food); small scope of usage can't use outside the Method
    }
}
