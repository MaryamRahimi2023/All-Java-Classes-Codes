package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More java";// select the area you want inside string and
        // at the bottom of the page will show you how-many characters are selected
        //return the new String from this index
        String newStr=str.substring(28);
        System.out.println(newStr);
        System.out.println("**********************");
        System.out.println(newStr);
        System.out.println("*****************************");
        System.out.println(str.substring(0,27));// specify the start and end part

    }
}
