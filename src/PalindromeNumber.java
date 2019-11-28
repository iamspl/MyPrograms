public class PalindromeNumber {

    public static void main(String args[]) {

        System.out.println(" Enter the number to check if the given number is palindrome" +  isPalindrome(454));
    }


    public static boolean isPalindrome(int number) {

        int sum = 0,temp;

        int remainder=0;

        temp = number;

        while (number > 0) {

            remainder = number % 10;
            number = number / 10;
            sum = (sum * 10) + remainder;

        }

        if (temp == number) {

            return true;
        }
        else {
            return false;
        }
    }
}
