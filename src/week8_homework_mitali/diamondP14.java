package week8_homework_mitali;

import java.util.Scanner;

//14. Write a program in Java to display the pattern like a diamond.
//      While loop
public class diamondP14 {
    public static void main(String[] args) {
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int m = 1;
        int n;

        do {
            n = 1;
            do {
                System.out.print(" ");
            }

            while (++n <= number - m + 1);
            n = 1;
            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (++m <= number);
        m = number - 1;
        do {
            n = 1;
            do {
                System.out.print(" ");
            } while (++n <= number - m + 1);

            n = 1;
            do {
                System.out.print("*");
            } while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (--m > 0);
    }
}




