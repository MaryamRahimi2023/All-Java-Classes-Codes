package class21.homework;

public class CreditCard {

    /* Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    // below constructor
    public CreditCard(double balance, double interest) {// Teacher code
        this.balance = balance;
        this.interest = interest;
    }

    // below is the method
    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest) / 100);
    }

// my codes solving problem

    /*public double calculateInterest(double balance, double interest){
        return balance *(interest/100);
    }*/
}
class Visa extends CreditCard{
    public Visa(double balance,double interest){// we are calling the constructor of parent class not using them
        // so that's why constructors are not participate in inheritance or overriding
        super(balance,interest);// if you are  inheriting from a class which has constructor we must get their constructor parameters as well
        // and call them by super keyword it doesn't mean that constructor are use in inheritance it is just that coz we are inheriting from
        // a class with constructor,
        // so we must have its parameters like a child will have the skin or hair color of the parent
        // we can add other parameters too inside child class if required

    }

}
class AX extends CreditCard{// I am inheriting from a class which has a constructor so my class need to have constructor as well

    AX(double balance,double interest){// this is this class constructor
        super(balance,interest);

        // @Override  AX(double balance,double interest){// this is this class constructor
            //super(balance,interest); we can not override a constructor showing error
    }


    @Override
    public void calculateInterest() {// we did not override the constructor we override the method only
        // super.calculateInterest(); this can work and if we want to add something to the method we can do below
        System.out.println(("Interest "+(balance*interest/100)+15));// this is what we can get from inheritance that use instance variables here
    }

    // my codes

    /* double calculateInterest(double balance, double interest) {
        return super.calculateInterest(balance,interest)+15;} */
}

  class CreditCardTester{

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest();
        Visa visa=new Visa(100,10);
        visa.calculateInterest();
        AX ax=new AX(100,10);
        ax.calculateInterest();


        // my codes

        /* CreditCard creditCard=new CreditCard();
        System.out.println(creditCard.calculateInterest(15000,5));

        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(15000,5));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(15000,5));*/

    }
}

