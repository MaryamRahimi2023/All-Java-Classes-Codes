package class18.homework.Task1A;

public class A {

    /* Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

*/

    void printA() {
        System.out.println("Print from Class A ");
    }
 }

   class B extends A{

        void printB (){
            System.out.println("Print from Class B");
        }
    }

   class C extends B{

        void printC(){

            System.out.println("Print from Class C");
        }


}
