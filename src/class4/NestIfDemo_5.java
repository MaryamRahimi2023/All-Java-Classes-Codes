package class4;

public class NestIfDemo_5 {

    public static void main(String[] args) {

        int money=1000;
        String day="Sunday";
        boolean mood=true;
        if(money>700){
            if(mood){
                System.out.println("Lets go shopping");}
        }else {
            System.out.println("Lets save some money first");
        }
        money=100;
        day="Sunday";
        mood=true;
        if(money>700){
            if(mood){
                System.out.println("Lets go shopping");}
        }else {
            System.out.println("Lets save some money first");
        }

        money=1000;
        day="Sunday";
        mood=false;
        if(money>700){
            if(mood){// because first if condition is yes then java will go to next if condition which is false then will not print anything
                System.out.println("Lets go shopping");}
        }else {
            System.out.println("Lets save some money first");
        }

        money=1000;
        day="Sunday";
        mood=false;
        if(money>700){
            if(mood){// because first if condition is yes then java will go to next if condition which is false then will not print anything
                System.out.println("Lets go shopping");
            }else {// if we put this else block with the 2nd if condition after the opened curly bracket then we will get another result
                System.out.println("Lets save some money first");}
        }
    }
}
