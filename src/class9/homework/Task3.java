package class9.homework;

public class Task3 {
    public static void main(String[] args) {


        /* 3) Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array: “Saturday is Java coding Day”.
         */

        String[] words={"Saturday","is","Java","coding","day.",};

        for (int i = 0; i < words.length ; i++) {
            System.out.print(words[i]+" ");

        }
        System.out.println();
        // 2nd way

        String[] word = {"Java", "Saturday", "day", "coding", "is"};

        System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]+".");

    }
}
