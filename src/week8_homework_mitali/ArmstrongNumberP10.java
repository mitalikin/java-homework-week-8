package week8_homework_mitali;
/*10. Write a program to input any number and check if it Armstrong number or not
*153 = (1*1*1)+(5*5*5)+(3*3*3)
*where:
      (1*1*1)=1
      (5*5*5)=125
      (3*3*3)=27
       So:
       1+125+27=153
*/
import java.util.Scanner;

public class ArmstrongNumberP10 {
    public static void main(String[] args) {
        int num, r, sum = 0, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Input any number");
        num = s.nextInt();
        temp = num;

        while (num > 0) {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Non-armstrong number.");

        }
        s.close();
    }
}

