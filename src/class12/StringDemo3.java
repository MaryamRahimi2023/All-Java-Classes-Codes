package class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName="Akhtar";
        String lastName="Lava";
        String fullName=firstName+" "+lastName;// most widely used
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat( " "+lastName));// so the input in the given example is first and last name and the output is fullName

    }
}
