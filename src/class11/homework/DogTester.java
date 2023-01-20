package class11.homework;

public class DogTester {

    public static void main(String[] args) {

        // 2) Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.

        Dog dog1=new Dog();
        dog1.name="Bob";
        dog1.breed="Husky";
        dog1.color="gray";
        dog1.age=2;
        dog1.weight=55.00;

        dog1.speak();
        dog1.sleep();
        dog1.Activity();

        Dog dog2=new Dog();
        dog2.name="Tommy";
        dog2.breed="Bulldog";
        dog2.color="Black";
        dog2.age=3;
        dog2.weight=25.00;

        dog2.eat();
        dog2.sleep();

        Dog dog3=new Dog();
        dog3.name="Jon";
        dog3.breed="Labrador";
        dog3.color="white";
        dog3.age=3;
        dog3.weight=30.00;

        dog3.Activity();
        dog3.speak();
        dog3.eat();




    }
}
