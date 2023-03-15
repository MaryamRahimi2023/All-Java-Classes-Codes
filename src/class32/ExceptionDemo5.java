package class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo5 {

    public static void main(String[] args) throws FileNotFoundException{// used to communicate to others that I am using a code which needs
        // a try catch block and if you are calling this code you should add it
        // not good approach
        // throw is to actually throw an exception
        // we can throw as parent class to like throws Exceptions

        FileInputStream fileInputStream=new FileInputStream("");// checked exception mandatory to handle mostly due to resources we are using

    // we can write try catch block or throws on others

    }

}
