package class13;

public class SplitMethodDemo {

    public static void main(String[] args) {

        String str="I Like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.?!]");// use this .?! to specify which sentence we want to separate it
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()
    }
}
