package class23;

public abstract class Animal {

    /* define the speak eat methods and create 3 subclasses and override the speak eat methods */

    // OOP it is a way of thinking only and not a language

    // Abstraction is a process of hiding the implementation details and showing only functionality to the user.

    // Using abstraction : it is a flexibility that help us not write the method in parent class completely(the body)
    // just to have the header in order to achieve overriding and polymorphism
    // it avoids the reputation of codes
    // however we can ignore it if we want to have the body of the method

    abstract void speak();

        // }System.out.println("All animals communicate one way or another");} without abstraction

    public void eat(){// without abstract
        System.out.println("All animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("WOF WOF");
    }

    @Override
    public void eat() {
        System.out.println("Dog FOOD");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("MIOW MIOW");
    }

    @Override
    public void eat() {
        System.out.println("CAT FOOD");
    }
}
class Bird extends Animal{
    @Override
    void speak() {
        System.out.println("TWEET TWEET");
    }

    @Override
    public void eat() {
        System.out.println("BIRD FOOD");
    }

}
