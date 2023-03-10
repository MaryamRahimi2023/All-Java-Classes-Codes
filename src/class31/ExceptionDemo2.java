package class31;

import utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo2 {

    public static void main(String[] args) throws IOException {

        /* java divide exceptions to 2 categories;

        1- something wrong with writing the codes (I can avoid these exception by coding properly or an if else conditions)
           run time error not showing in compile time
           like:(System.out.println(10/0);)

        2- some problem from the sources that we are using for our code ( java will give us compile time error, and we can avoid them by
           writing try-catch block) we have to do it forced by java coz if something goes wrong other codes could work
           like: (ExcelReader.read();)
         */

        test();// JVM java virtual machine will call this method and when sees that no one wrote ant try-catch block and throwing the responsibility on him
        // so you will get run time error and close application the better approach is to write try-catch block

    }

        static void test () throws IOException {
            try {
                ExcelReader.read();// plan A
            }catch (Exception e){
                System.out.println(e);// plan B
            }
            ExcelReader.read();

            try {
                ExcelReader.read();// plan A
            }catch (Exception e){
                try {
                    System.out.println(e);// plan B
                }catch (Exception d){
                    System.out.println(d);// plan c if required we can have multipal nested try-catch blocks
                }
                ExcelReader.read();
            }


    }
}
