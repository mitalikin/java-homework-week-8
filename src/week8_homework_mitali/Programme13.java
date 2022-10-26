package week8_homework_mitali;

/*13. Shared Digit
 Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.
 EXAMPLE INPUT/OUTPUT:
 hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 NOTE: The method hasSharedDigit should be defined as public static
* */
public class Programme13 {
    public static void main(String[] args) {
        System.out.println("hasSharedDigit(12,23);" + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9,99);" + hasSharedDigit(9, 99));
        System.out.println("hasShareDigit(15,55);" + hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        if (x / 10 == y / 10 || x / 10 == y % 10 ||
                x % 10 == y / 10 || x % 10 == y % 10) {
            return true;
        }

        return false;
    }

}


