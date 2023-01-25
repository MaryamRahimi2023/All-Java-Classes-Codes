package class13.homework;

public class Task3 {

    public static void main(String[] args) {

        // 3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] aArry=a.split("[?]");
        System.out.println(aArry.length);

    }
}
