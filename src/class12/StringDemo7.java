package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love Java";
        boolean startsWith=str.startsWith("I");// if i then we will get false
        System.out.println(startsWith);
        System.out.println(str.endsWith("a"));

        // methods chaining using multipart methods in same line but all methods should be same data type here String not int like .length

        System.out.println(str.toLowerCase().startsWith("i"));// we changed all letters to lowercase first then checked for i then we got true
        //System.out.println(str.length().startsWith("i"));

        System.out.println(str.contains("java"));// check weather a word is present in a string or not coz lowercase returns false


    }
}
