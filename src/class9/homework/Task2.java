package class9.homework;

public class Task2 {
    public static void main(String[] args) {

        /*
        2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array)
         */
       // First way

        String [] names={"Omid","Maryam","Tamim","Khatera"};
        System.out.println(names[1]);

        // 2nd way

        String [] GNames=new String[4];

        GNames[0]="Omid";
        GNames[1]="Maryam";
        GNames[2]="Tamim";
        GNames[3]="Khatera";

        for (int i = 3; i < GNames.length; i++) {
            System.out.println(GNames[1]);

        }




    }
}
