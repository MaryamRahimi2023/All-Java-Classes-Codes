package class18;

public class Book {

    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String name;
    String author;
    int iSBN;

    Book(String name,String author){
        this.name=name;
        this.author=author;
    }

    Book(String name,String author, int iSBN){
        this(name,author);
        this.iSBN=iSBN;
    }
    void printDetails(){

        System.out.println(name+" "+author+" "+iSBN);
    }

    public static void main(String[] args) {

        Book book1=new Book("Java","Asghar");
        book1.printDetails();

        Book book2=new Book("Java","Asghar",201567);
        book2.printDetails();


    }
}
