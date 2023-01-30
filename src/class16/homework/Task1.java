package class16.homework;

public class Task1 {

    /*1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
          Method should be visibly only within same package and accessible by the creating an instance of the class.

          access modifier default within same package not same class
          if static word with a method we can directly call that method without creating an object=instance so, not apply here
*/
    int sumArray(int[]arr){

        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        Task1 task1=new Task1();// this is the instance or object of the class
        int [] arr={10,25,35,45};
        System.out.println(task1.sumArray(arr));
    }


}