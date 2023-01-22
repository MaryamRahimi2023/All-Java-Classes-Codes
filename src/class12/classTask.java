package class12;

import java.util.Scanner;

public class classTask {
    public static void main(String[] args) {

        /* Store username, password and confirm password from a user and check following requirements:

       Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
       Password should be minimum 8 characters, if less → message=”Password is too short”.
       Password cannot contain username if so, → message=”Password cannot contain username”.
       Password should match confirmed password, if not  → message=“Passwords do not match”.

       Only after all requirements met → message “Your username and password has been created”  */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your: ");
        String userName=scanner.next();
        System.out.println("Please enter your password: ");
        String password=scanner.next();
        System.out.println("Please confirm your password: ");
        String confirmPassword=scanner.next();

        //boolean userNameIsEmpty=userName.isEmpty(); we can assigne too in boolean and print or directly
        //boolean passwordIsEmpty=password.isEmpty();

        if(userName.isEmpty() || password.isEmpty()){// if we want to check both conditions are true we put && if we need only one condition to be true we use ||
            System.out.println("Username and Password cannot be empty");
        }
        else if (password.length()<8){// we can not use switch case here coz switch case will not work >,<,||
            System.out.println("Password is too short");
        }
        else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }
        else if(!password.equals(confirmPassword)){
            System.out.println("Password do not match");
        }else {
            System.out.println("your username and password are created");
        }


    }
}
