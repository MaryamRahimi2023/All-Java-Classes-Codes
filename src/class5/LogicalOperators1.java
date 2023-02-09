package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        // this || means or and or not logical or operation

        System.out.println(true||false);
        System.out.println(false||false);

        System.out.println(false||true|false|false);

        boolean boughtCho=true;
        boolean boughtFlowers=true;

        if(boughtCho||boughtFlowers){
            System.out.println("I am Happy");
        }else{
            System.out.println("I am Sad");
        }

        boolean wifi=true;
        boolean fiveG=true;

        if (!wifi || !fiveG || boughtCho || boughtFlowers) {
            System.out.println("You are good for browsing the internet");
        }else {
            System.out.println("Either connect to wifi or to 5G");
        }
    }
}
