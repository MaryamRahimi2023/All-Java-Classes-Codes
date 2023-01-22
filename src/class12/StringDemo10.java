package class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String str="Java is not pain";
        System.out.println(str.indexOf("j")); // checking the position of a character and give you the number of the index for that letter in the String
        // System.out.println(str.indexOf("not")) will check the word, j is not in this string, so we get -1 lowercase j
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+i);
        }




    }
}
