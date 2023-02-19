package class25;

public interface TrustAble {

    public static final int age=10;
    // always in interface all variables are public static final in oder way Constants

   // private String color="Red"; can not have private and protected in interface

   int trust(); // a method of return

    static  void method1(){// we can have static method in interface
        System.out.println("Hello world");
    }
}
class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {

        TrustAble.method1();
    }
}
