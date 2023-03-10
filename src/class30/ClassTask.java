package class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ClassTask {

    public static void main(String[] args) throws IOException {

        String path="Files/test2.properties";

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","Majeed");
        properties.setProperty("Last Name","Rahimi");
        properties.setProperty("Grade","2nd");
        properties.setProperty("Favorite Subject","Math");
        properties.setProperty("School Name","Fallsington");
        properties.store(fileOutputStream,"He is my son");

    }
}
