package class6;


public class LogicalAndDemo {
    public static void main(String[] args) {

        boolean understandJava=false;
        boolean enjoyJava=false;

        if(understandJava&& enjoyJava){
            System.out.println("You get the Job Quickly");
        }else {
            System.out.println("We need to work hard");
        }
        boolean understandJava1=false;
        boolean enjoyJava1=true;

        if(understandJava&&enjoyJava){//false
            System.out.println("You get the Job Quickly");
        }else {
            System.out.println("We need to work hard");
        }
    }
}
