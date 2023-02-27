package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

       boolean summer=true;
       int temp=75;

       while (summer) {

           if (temp <= 100) {
               System.out.println("I love summer because the temperature is " + temp);
           } else {
               System.out.println("Its very hot " + temp);
               break;// it is called break statement
           }
           temp += 5;
       }

           System.out.println("_________________");

           /*for (int temp1=75;temp1<=100;temp1+=5){
               if(summer==true);
               System.out.println("I love summer because the temperature is "+temp);
           }
           System.out.println("Its very hot "+temp);*/

           int temp2=75;

           while (temp2<=105) {
               if (temp2 <= 100) {
                   System.out.println("I love summer because the temperature is " + temp2);
               } else {
                   System.out.println("Its very hot " + temp2);
               }
               temp2 += 5;

           }
       }

    }

