package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";

        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+" "+lastName);
        System.out.println("First name ="+firstName);
        System.out.println("Last name ="+lastName);

        System.out.println("10"+"10");

        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);

        // java execute rules from top to bottom but if we have multipart
        // operations on the same lines it follow them from left to right.

    }
}
