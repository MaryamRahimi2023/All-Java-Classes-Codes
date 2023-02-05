package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){
            System.out.println("Male");
        }

        String name="Sam"; // String name="Nat"
        // with non-primitive data types such as String we can not use == symbol
        // we use ! if not
        if(name.equalsIgnoreCase("sam")) {
            System.out.println("Amazing student");
            // if(!name.equals("Sam"))

        }

        //String name="Nat";
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }
        // ! symbol can change true to false and false to true
        if(!name.equals("Sam")){
            System.out.println("Super Amazing student");
        }

        String name1="Nat";
        if(!name1.equals("Sam")) {
            System.out.println("Super Amazing student");

        }


    }



}
