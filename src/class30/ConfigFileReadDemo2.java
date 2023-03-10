package class30;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo2 {

    public static void main(String[] args) throws IOException {

        // Path where we want to create the new file and the name of the file with its extension
        String path="Files/test.properties";

        // A class that helps us navigate to that folder where file is stored
        // we use FileOutStream when we have to write the data to a file

        FileOutputStream fileOutputStream=new FileOutputStream(path);// creating the object of  FileOutputStream class

        // This "Properties" class will assist us to read and write data to .properties files
        Properties properties=new Properties();// creating the object of Properties class , it is a child class of map class

        // Add all the data to file inside that above object "properties".
        properties.setProperty("Name","Maryam");// write this data to our new created file
        properties.store(fileOutputStream,"A new name has been added");// write comments with our entry into the file

        // fileOutputStream.close();

    }
}
