package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="jdnfkfd 3498234555 ^*%* ";

        int counter=0;
        int counter1=0;
        int counter2=0;

        for (int i = 0; i < str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
            if(Character.isDigit(str.charAt(i))){
                counter1++;
            }
            if (Character.isSpaceChar(i));
            counter2++;
        }

        System.out.println("Total isAlphabetic in str "+counter);
        System.out.println("Total isDigit in str "+counter1);
        System.out.println("Total isspace in str "+counter2);


    }
}
