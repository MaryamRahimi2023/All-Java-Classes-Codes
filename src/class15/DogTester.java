package class15;

public class DogTester {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.printFood();// remove after print in debug

        for (int i = 0; i < 2; i++) {
            System.out.println(i);// local variable will disappear after done using them
        }
        // System.out.println(i); can't use outside of block of code
    }

}
