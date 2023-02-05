package class18.homework.Task1A;

import class18.homework.Task1A.A;

public class ATester {

    public static void main(String[] args) {

        A letters=new A();
        letters.printA();

        B letter=new B();
        letter.printB();
        letters.printA();

        C letter1=new C();
        letter1.printC();
        letters.printA();
        letter.printB();



    }
}
