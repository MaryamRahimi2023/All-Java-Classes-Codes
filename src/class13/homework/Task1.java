package class13.homework;

public class Task1 {

    public static void main(String[] args) {

        // 1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str="I like learning";
        System.out.println("New String: " +str.replaceAll(" ",""));

        // we can also create a new Sting like

        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);



    }
}
