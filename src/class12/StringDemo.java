package class12;

public class StringDemo {

    public static void main(String[] args) {

        //creating an object of the String class

        String strObj=new String("Java");

        //another way of creating an object of String class a shorter way
        //mostly this is how we create the objects of String class

        String strObj2="Java";
        System.out.println(strObj2.length());// .length is a methode act like a copy machine and data type is integer number of letters
        // without any data inside the parentheses it prints the size of latter's in a String.

        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="Hamid Poya ";
        if(name.length()>10){
            System.out.println("Name can't be more then 10 letters"); // used in websites to check the username conditions
        }

    }
}
