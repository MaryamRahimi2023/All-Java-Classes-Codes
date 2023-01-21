package Project1;

public class Task11 {
    public static void main(String[] args) {

/*        11)Write a program to print out duplicate elements from an Array of Strings? */

        String [] fruits={"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[i]==fruits[j]){
                    System.out.println("Duplicate item found : "+fruits[j]);
                }

            }

        }

    }
}
