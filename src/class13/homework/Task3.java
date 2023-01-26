package class13.homework;

public class Task3 {

    public static void main(String[] args) {

        // 3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] aArry=a.split("[?]");
        System.out.println(a.split("[?]").length);
        String [] aArry1=a.split(" ");
        System.out.println(aArry.length);
        String [] aArry2=a.split(aArry[2]);
        System.out.println(aArry[2]);
        String [] aArry3=a.split("[it]");// we can split based on anything percent in this string
        System.out.println(a.split("[it]").length);

    }
}
