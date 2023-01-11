package class4;

public class NestIfDemo_6 {
    public static void main(String[] args) {

        boolean studyHard=true;
        if(studyHard){
            System.out.println("We get the job");
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

        studyHard=false;
        if(studyHard){
            System.out.println("We get the job");
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

        studyHard=true;
        int salary=90000;
        if(studyHard){
            System.out.println("We get the job");
            if(salary>100000){
                System.out.println("Lets buy a Tesla");
            }else {// Nestif condition depends to the other if condition
                System.out.println("lets buy Toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

        studyHard=false;
        salary=90000;
        if(studyHard){
            System.out.println("We get the job");
            if(salary>100000){
                System.out.println("Lets buy a Tesla");
            }else {// Nestif condition depends to the other if condition
                System.out.println("lets buy Toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

    }
}
