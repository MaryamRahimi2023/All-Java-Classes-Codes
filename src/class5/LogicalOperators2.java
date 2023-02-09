package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        /* if the score in all the subjects are greater than 90 print you are a brilliant student otherwise you need to work hard
        */

        System.out.println(true&&true);// && and logical and operation
        System.out.println(true&&false);

        System.out.println(false&&false);


        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=83.5;

        if(mathScore>90 && historyScore >90 && scienceScore>90){

            System.out.println("You are a brilliant student");
        }else{
            System.out.println("You need to work hard");
        }

        // if we need to customize the answers, so we need to still go with
        // if nested operations we can not use ant of this logical operations

        if(mathScore>90.0){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder with Science");
                }
            }else{
                System.out.println("You need work harder in history");
            }

        }else{
            System.out.println("You need work harder with Math");
        }





    }
}
