package class11;

public class CatTester {

    public static void main(String[] args) {
        // creating an object from the Cat class
        Cat cat1=new Cat(); // Cat is class, cat1 is object,
        cat1.name="Lego";// cat1 object, .name is the methode
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.colors="Gray";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.colors="White";

        System.out.println(cat2.breed);

        cat2.speak();

    }
}
