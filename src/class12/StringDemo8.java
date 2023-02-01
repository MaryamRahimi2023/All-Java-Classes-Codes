package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="Java is love";
        char character=str.charAt(2);
        System.out.print(character);

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){// going one by one letters and count the number a
                counter++;
            }

        }
        System.out.println(counter);



    }
}
