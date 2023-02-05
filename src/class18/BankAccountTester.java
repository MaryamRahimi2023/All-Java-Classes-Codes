package class18;

public class BankAccountTester {
        public static void main(String[] args) {

            BankAccount ba=new BankAccount();
            ba.accountNumber=765765875875l;
            ba.money=1000;
            ba.deposit();

            System.out.println(ba.accountNumber);
            System.out.println(ba.money);
            //ba.tranfer(); methods defined inside child class not available to the parent class

            System.out.println("  -- Creating an Object of Checking account");

            Checking check=new Checking();
            //features from parent
            check.accountNumber=5765;
            check.money=780;
            //features from checking class itself
            check.interest=0;

            check.deposit(); //from parent
            check.transfer(); //from child

            System.out.println("  -- Creating an Object of Savings account");

            Savings save=new Savings();
            save.accountNumber=8758585985l;
            save.money=7657;
            save.profit=100;
            //save.interest=0; siblings features are not available

            save.deposit();//from parent
            save.takeProfit();//comes from savings
            //save.transfer(); not available

            //finish creating SuperSavings object and see which feature available to that class

            SuperSavings sSave=new SuperSavings();

            //available features from BankAccount class his grand Parents class
            sSave.accountNumber=7564;
            sSave.money=60;
            sSave.deposit();

           /*sSave.interest=50; not available, can not take from Checking class from his uncle class
           sSave.transfer();   */

           // available features from saving class his Parents class
            sSave.profit=40;
            sSave.takeProfit();

            // available features from SuperSaving class itself
            sSave.superSaving();

        }
    }
