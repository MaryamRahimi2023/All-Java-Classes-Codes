package class15;

public class classTask {

    /* Create a method createEmail(). Based on values of users name,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    //return type String
    //method name createEmail
    //parameters String FN,lN,email type
    /*{ concat
    }
     */

    String createEmail(String firstName, String lastName,String emailType){
        return firstName+lastName+"@"+emailType+"com";
    }

    public static void main(String[] args) {

        classTask info=new classTask();
        System.out.println(info.createEmail("Maryam","rahimi","gmail"));
    }

}
