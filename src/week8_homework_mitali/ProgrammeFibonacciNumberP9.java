package week8_homework_mitali;

import java.util.Scanner;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class ProgrammeFibonacciNumberP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter maximum number: ");
        int maxNumber = sc.nextInt();
        sc.close();
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.println("Fibonacci series of " + maxNumber + " numbers:");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.println(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
