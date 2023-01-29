package class15.homework;

public class Task5 {

    // 5) Write a method to return whether given number is prime or not?

    boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    return false;
                }
            }
        } return true;
    }
}
