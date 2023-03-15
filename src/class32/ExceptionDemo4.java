package class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {

    public static void main(String[] args) throws FileNotFoundException {// throw and throws uses (exception are classes)

        /*String path=null;
        FileInputStream fileInputStream=new FileInputStream(path);// Exception in thread "main" java.lang.NullPointerException*/

        /*String name="abeera";

        if(name.length()<8){
            throw new RuntimeException("This name is not allowed");// this is how we through exception
        }*/

        String name1 = "abeera";
        if (name1.length() < 8) {
            throw new LazyException("not this name");
        }

    }

}
