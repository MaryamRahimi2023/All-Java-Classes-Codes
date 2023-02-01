package class17.homework;

public class Book {

    /* 6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
          Instance variables are being initialized
          Both Constructors are being executed
    */

    String name;
    String author;
    int iSBN;

    Book(String bName, String aName){
        name=bName;
        author=aName;
    }
    Book(String bName, String aName, int serialNo){
        name=bName;
        author=aName;
        iSBN=serialNo;
    }
    void printInfo(){

        System.out.println(name + " by " + author);

        if(iSBN!=0) {
            System.out.println(iSBN);
        }
    }

    public static void main(String[] args) {

        Book b1=new Book("To Kill a Mockingbird","Harper Lee");
        Book b2=new Book("1984","George Orwell",973398754);

        b1.printInfo();
        b2.printInfo();
    }

}
