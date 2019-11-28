public class SumOfDigits {

    public static void main(String[] args){
        System.out.println("The sum of the digits in number  123 is " + sumDigits(123));
    }

    private static int sumDigits(int number){

        if(number <10){

            return -1;
        }

        int sum=0;
        while(number >0){

            int digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }

        return sum;
    }
}
