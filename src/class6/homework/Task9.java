package class6.homework;


public class Task9 {
    public static void main(String[] args) {
/*
        Create a boolean variable workDay and assign true create int variable day and assign it to 1
        As long as it is workDay print “I need a day off” and increase day.
                Once day is 6 print “I do not need a day off any more”*/

        boolean workDay=true;
        int day=1;

        while(workDay){
            if(day<=5) {
                System.out.println("I need a day off");
            }else {
                System.out.println("I do not need a day off any more");
                workDay=false;
            } day++; // it is equal to day=day+1 and day+1
        }


    }
}