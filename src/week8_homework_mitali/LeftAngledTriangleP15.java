package week8_homework_mitali;
//Display left angle triangle of * using nested for loops
/*
     *
    **
   ***
  ****
 *****
* */
import java.util.Scanner;

public class LeftAngledTriangleP15 {
    public static void main(String[] args) {
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
