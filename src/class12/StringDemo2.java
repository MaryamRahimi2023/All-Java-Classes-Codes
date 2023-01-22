package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        //9000 classes in java and inside each class 100+ methods
        // only converts the uppercase letters to the lowercase
        String str="JAVA IS FUN";
        String newStr=str.toLowerCase();
        System.out.println(newStr);

        // only converts the lowercase letters to the uppercase

        String str2="i love java";
        String upperLetters=str2.toUpperCase();
        System.out.println(upperLetters);

    }
}
