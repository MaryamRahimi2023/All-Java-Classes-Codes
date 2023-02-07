package class19;

public class Child1 extends Parent {

    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();// static method can be accessed by class name
        Child1.bye();
        c1.bye();// still can be accessed by obj name but this is not the right way
       // c1.money(); private method cannot be accessed in different class

        c1.name="Mary";
        Parent.lastname="Ruby";
        // or through name of my current class
        Child1.lastname="Ruby";
    }

}
