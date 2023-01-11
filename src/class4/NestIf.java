package class4;

public class NestIf {
    public static void main(String[] args) {

        int money=100;
        String day="Sunday";
        boolean mood=true;
        if(money>700){// java will print from this bracket to the end of this bracket first if yes then will print other codes if no nothing will print
            if(mood) {
                System.out.println("Lets go shopping");}}

            money=1000;
            day="Sunday";
            mood=true;
            if(money>700){// java will print from this bracket to the end of this bracket first if yes then will print other codes if no nothing will print
                if(mood){
                    System.out.println("Lets go shopping");}}// this is Nestif while you put one if condition inside another if condition
    }


}
