package class19;

public class User {// child class of object class even if we did not create or extend it like a grant parents for UserInfo class

    /* Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code. */

    String name;
    String mobileNumber;

    User(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserInfo extends User{

    String userAddress;

    UserInfo(String name,String mobileNumber,String userAddress){
        super(name,mobileNumber);
        this.userAddress=userAddress;
    }void userDetails(){
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+mobileNumber);
        System.out.println("Address: "+userAddress);
    }
}


