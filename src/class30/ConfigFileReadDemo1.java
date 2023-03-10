package class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {

    public static void main(String[] args) throws IOException {

        // Location or path of the file which we want to read the data
        String path="Files/config.properties";

        // A class that helps us navigate to that folder where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);

        // This "Properties" class will assist us to read and write data to .properties files
        Properties properties=new Properties();// it is a child class of map class


        // Loads all the data from file inside that above object "properties".
        properties.load(fileInputStream);
        System.out.println(properties.get("User"));// user123
        System.out.println(properties.get("password"));// pass123
        System.out.println(properties.get("URL")); // www.google.com
        System.out.println(properties.get("browser"));// Firefox
        fileInputStream.close();

    }
}
