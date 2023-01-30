package class16;

public class Person {

    private double bankBalance=1250000;// this private word is called modifier,these variables only use within same class even not in personTester

    String address="Street 123";// default access level is applied within same class and package not in another class

    public String name="John Snow";// this public word is called modifier,can use within the class and same package and different package

    private void printPhonePassword(){// super sensitive so private
        System.out.println("pass123");
    }

    void printSSN(){
        System.out.println("123456789");
    }

    public void printTikTokAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {

        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();// can be used inside the same class
        person.printSSN();
        person.printTikTokAccount();

        /*

        Default : When no access modifier is specified, it is treated as default modifier. Its scope is limited within the package.
        Public: The word itself indicates that it has scope everywhere, i.e; it is visible everywhere even outside the package.
        Private: It has scope only within the class.
         */
    }

}
