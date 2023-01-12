package class6.homework;

public class test {
    public static void main(String[] args) {
// program to print sum of all odd && even numbers from 0 100 sepreatly

        int i;
        int sum=0;

        for (i=0; i<101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
            System.out.println(sum);

    }
}
