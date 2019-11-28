public class EvenDigitSum {

    public static void main(String Args[]){

        System.out.println("the sum of even digits is " + getEvenDigitSum(777));
    }


        public static int getEvenDigitSum(int number) {
            if (number < 0) {
                return -1;
            }

            int lastDigit = number % 10;
            int firstDigit = 0;

            while (number != 0) {
                firstDigit = number;
                number /= 10;
            }
            return firstDigit + lastDigit;
        }
    }



