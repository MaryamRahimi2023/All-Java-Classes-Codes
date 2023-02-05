package class12;

public class CarTester {

    public static void main(String[] args) {

        // create the object of the class

        Car bmw=new  Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="black";
        bmw.moveForward();
        bmw.applyBrakes();
        // Create two different object from this class
        // the methods from those classes

        Car audi=new Car();
        audi.model="E-torn";
        audi.make="Audi";
        audi.year=2014;
        audi.color="blue";
        audi.applyBrakes();
        audi.moveForward();

    }
}
