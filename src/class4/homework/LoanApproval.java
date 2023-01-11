package class4.homework;

public class LoanApproval {
    public static void main(String[] args) {

        // You are a loan specialist and you need to ask user what is the amount of loan is needed.
        // If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.

        int loan=190000;

        if(loan<=200000){
            System.out.println("Loan is Approved");
        }else {
            System.out.println("Loan is Rejected");}
    }
}
