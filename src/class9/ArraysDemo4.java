package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        // create an array to store the letters A B c d e F

        char[] letters={'A','B','c','d','e','F'};
        letters[0]='z';// updating the elements at index 0
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);

        }
    }
}
