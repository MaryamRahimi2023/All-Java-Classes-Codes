package class23;

public class AnimalTester {

    public static void main(String[] args) {

        //Animal animal=new Animal(); we can not create the object od the class it is abstract
        // animal.speak(); and can not call the method

        // but still we can still do the polymorphism

        Animal [] arr={new Cat(),new Dog()};
        for (Animal animal:arr){
            animal.speak(); // abstracted
            animal.eat(); // not abstracted just normally override
        }
    }
}

