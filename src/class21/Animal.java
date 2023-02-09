package class21;

public class Animal {// why we inharate from one class to other class to reuse the cods.

    String name;
    String color;
    int age;
    double weight;
    // we are overriding speak method in cat class
    static void speak(){ // here I should put something generic
        System.out.println("Animal can speak");
    } // both method should be static if we want to do static
    void eat(){
        System.out.println("All the animals eat");
    }


}// inharatance has one problem which is called inighttakling which means one class is too much depend on other class
class Cat extends Animal{

    static void speak(){// both method should be static if we want to do static
        speak();
       // super.speak(); use this if non-static
        System.out.println("Meow Meow ..........");
    }
    void printName(){
        System.out.println(name);
    }



}
class Dog extends Animal{

}
class Tester{

    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.speak();
    }
}