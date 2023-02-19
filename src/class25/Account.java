package class25;

public class Account {
    private double balance;
    private String accountNumber;
   private String type;
   private String accountTitle;


   public String getAccountTitle(){// if we want to public and can use any filed outside class
       return accountTitle;
   }

   public void setBalance(double balance){
       // sanitizing the input meaning checking the value before we can assign them
       if (balance<0){
           System.out.println("Negative balance is not allowed in current account");
       }else {
           this.balance=this.balance+balance;
       }
   }

   public double getBalance(){
       return balance;
   }
   // create a setter method for account number
   public void setAccountNumber(String accountNumber){
       if (accountNumber.length()!=16){
           System.out.println("Wrong account number");
       }else {
           this.accountNumber=accountNumber;
       }

   }


    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}
class AccountTester{
    public static void main(String[] args) {

        Account account=new Account(-1000,"hfhfgjhsdghdjk","fgsadfgasdjh","dhfjdsh");
     /* account.balance=-500;*/  //coz private we can not access it outside the class

        // because we do not give the use a free hand to write anything, so we do encapsulation (says protect your filed)
        //  is saying every program should have separate classes and main and being organized
        // 2) for sensitive information it is a bad idea to let anyone access it and change the codes,
       // so we should make these information or files private

        System.out.println(account.getAccountTitle());// only will print it, but we can not modify it means assign it
        //System.out.println(account.setBalance(87.98));
    }
}
