package class12.homework;

public class Task1 {

    public static void main(String[] args) {

        /* 1) Create a String and if the String is not empty perform the following:
            if the String has an odd number of characters and has 3 or more characters, print the character
            in the middle of the String.
            For Example String str=hello =>l
*/
        String str="happy";
        if(!str.isEmpty()){
            if(str.length()%2==1 && str.length()>3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }




    }
}