package week8_homework_mitali;
/*
* @
* @ @
* @ @ @
* @ @ @ @
* @ @ @ @ @ */
import java.util.Scanner;

public class ProgrammeRightAngleTriAngleP8 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter Right Angled Triangle Pattern Rows=");
        int rows = sc.nextInt();
        System.out.println("Printing Right Angled Pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
