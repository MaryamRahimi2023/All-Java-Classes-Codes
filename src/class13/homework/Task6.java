package class13.homework;

public class Task6 {

    public static void main(String[] args) {

        // 6) How would you swap  2 strings without a temporary variable?

        String str1="I am sleepy";
        String str2="go sleep";

        System.out.println("Before: " +str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After: "+str1+" "+str2);

    }
}
