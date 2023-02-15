package class24;

public interface WashAble{// it is by default abstract class too , 90% of time if we want to do abstract we will go with interface
// we can put the public with the class name which is same as interface file name
    void wash();// in interface the methods by default are abstract also public is by default
}

class SmartWatch implements WashAble{// things are by default designed as abstract class
    @Override
    public void wash() {
        System.out.println("you can wash this Smart watch with out any issue");

    }
}
class Phone implements WashAble{
    @Override
    public void wash() { // if we remove the public keyword we will get an error coz the methods by default in interface are public
        // and in a class the methods are default, and we can not decrease the visibility from public to default,
        // so we have to put  here public to not get the error
    }
}
class Inverter implements WashAble{
    @Override
    public void wash() {
        System.out.println("I am IP65 Rated you can wash me");
    }
}


