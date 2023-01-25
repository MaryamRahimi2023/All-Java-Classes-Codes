package class13;

public class StringRecap {

    public static void main(String[] args) {

        // How can I print all the letters from this String one by one

        String str = "Java is Great";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // what is the input to the charAt() method input is integer and output is a char

        // count how many times the letter a has appeared in the above String

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if(str.charAt(i)=='a'){ // we use == not .equal coz we are counting letters and it is char not string
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+ " in the above String");

    }
}
