package class27.homework.Task7;

public class Card {

    /* 7) Create a Card class that will have interest rate field and card type
          and a constructor that will initialize the fields.
          Create 3 objects of different card and store them into LinkedList.
          Using for loop/advanced for loop/ iterator access all methods of the class.
*/
    double interest;
    String cardType;

    public Card(double interest, String cardType) {
        this.interest = interest;
        this.cardType = cardType;
    }
    void open(){
        System.out.println("You can open this credit card");
    }
    void charges(){
        System.out.println("You will get charged if you did not pay your balance until end of the month");
    }

}
