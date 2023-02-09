package class21;

public class CreditCard {

    /* Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    double calculateInterest(double balance,double interest){
        return balance *(interest/100);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    double calculateInterest(double balance, double interest) {
        return super.calculateInterest(balance,interest)+15;
    }
}
class CreditCardTester{

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard();
        System.out.println(creditCard.calculateInterest(15000,5));

        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(15000,5));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(15000,5));

    }
}

