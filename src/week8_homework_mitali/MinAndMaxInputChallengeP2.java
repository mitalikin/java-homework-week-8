package week8_homework_mitali;
/*Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
* -Before the user enters the number,print the messege Enter number:
* -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
* Hint:
* -Use an endless while loop.
* Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallengeP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(or -1 to stop): ");
        int number = sc.nextInt();
        int max = number;
        int min = number;
        while (number != -1) {

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }

            System.out.println("Enter the number(or -1 to stop):");
            number = sc.nextInt();
        }
        if (max != -1 && min != -1) {
            System.out.println("maximum was" + max);
            System.out.println("minimum was" + min);
        }
    }
}
