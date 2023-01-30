package class16;

public class PersonTester {

    public static void main(String[] args) {

        Person person=new Person();
        //System.out.println(person.bankBalance);// not working in another class with the object
        System.out.println(person.address);
        System.out.println(person.name);
        //person.printPhonePassword(); can not be use inside another class which is PersonTester
        person.printSSN();// can be use here but not in another package like a class in package 15
        person.printTikTokAccount();// can be use in any class and package inside the project


        //example for using ? instead of if else

        int number=0;
        /*
        if(3>2){
            number=10;
        }else {
            number=20;
        }
        System.out.println(number);*/

        number=(3>2)?10:20;// shorter way of writing if else conditions
        System.out.println(number);

        number=(3>2)?(4>5)?15:65:20;// for multiple conditions
        System.out.println(number);



    }

}
