package week8_homework_mitali;
/*write a method named getEvenDigitSum with one parameter of the type int called number.
*The method should return the sum of the even digits withine the number.
* If the number is negative,the method should return-1 to indicate an invalid value.
* Example input/OutPut
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); →should return 4 since2+2=4
* getEvenDigitSum(-22); → should return -1 since the number is negative
* NOTE: The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitSumP11 {

        public static int getEvenDigitSum(int number) {

            if (number < 0) {
                return -1;
            }
            int sum = 0;
            while (number > 0) {
                int remainder = number % 10;

                if (remainder % 2 == 0) {
                    sum += remainder;
                }

                number /= 10;
            }

            return sum;
        }

    public static void main(String[] args) {
        System.out.println("getEvenDigitSum(123456789): "+getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252): "+getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22): "+getEvenDigitSum(-22));
    }
    }



