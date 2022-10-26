package week8_homework_mitali;
/*Digit Sum Challenge
 * write a method with the name sumdigit that has one int parameter called number.
 * If the parameter is>=10 then the method should process the number and return sum of all digits,
 * otherwise return-1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers,so also return-1 for negative numbers.
 * For example calling the method sumDigit(125) should return 8 since 1+2+5=8.
 * Calling the method sumDigit(1) should return-1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint:   Use n % 10 to extract the least-significant digit.
 *      Use n = n / 10 to discard the least-significant digit.
 *      The method needs to be static
 *      Create a class with the name DigitSumChallenge.
 */

import java.util.Scanner;

public class DigitSumChallengeP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int digits = sc.nextInt();

        System.out.println("sum of number is= " + sumDigit(digits));
    }

    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
