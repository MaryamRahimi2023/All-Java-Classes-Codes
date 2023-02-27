package class27.homework.Task6;

public abstract class Insurance {

    /* 6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
          Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
          Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    public static final String insuranceName="AAA";// we can do a constructor for this do to initialize its  object
    public abstract void getQuote();
    public abstract void cancelInsurance();


}
class Car extends Insurance{
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Car insurance is $200 monthly");

    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your insurance with a one month notice prior to cancellation");

    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String petType) {
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Pet insurance is $100 monthly");

    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can give 3 days notice prior your cancellation");

    }
}
class Health extends Insurance{
    @Override
    public void getQuote() {
        System.out.println("Health insurance is $150 monthly");

    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your insurance one month prior cancellation");

    }
}
