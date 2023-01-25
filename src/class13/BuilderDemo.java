package class13;

public class BuilderDemo {

    public static void main(String[] args) {

StringBuilder stringBuilder=new StringBuilder("Sunday");
        System.out.println(stringBuilder.reverse());

        // String and StringBuilder are the same we use to creat Strings but with below difference:

        String state="VA";// when we need to design a program to be fast and not caring about memory we use StringBuilder
        String state1="VA";// when we need to design a program to be slow but safe memory we use String
        String state2="VA";
        state2="CA";// what if someone change the value of the variable if we create one box with different variable names
        // so the value will be changed for all this concept is called Immutability(not changeable).
        // if we face like someone want to change or update the value so in the RAM the previous link with the first box will be removed
        // and create a new box for the update variable, and it is value and make link with the new box


    }
}
