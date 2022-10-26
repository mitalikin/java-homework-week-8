package week8_homework_mitali;
/*12. Write a programme to input any number and check if it is prime or not.
* (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
* prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
* 17.... are the prime numbers.)
* */
import java.util.Scanner;

public class PrimeOrNotP12 {
    public static void main(String[] args) {
        int myNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        myNumber = sc.nextInt();
        boolean isPrimeNumber = false;
        for (int i = 2; i <= myNumber / 2; ++i) {
            if (myNumber % i == 0) ;
            isPrimeNumber = true;
            break;
        }
        if (!isPrimeNumber)
            System.out.println("The number " + myNumber + " is a prime number");
        else
            System.out.println("The number " + myNumber + " is not a prime number");
    }
}
