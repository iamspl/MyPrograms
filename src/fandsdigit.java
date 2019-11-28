public class fandsdigit {

    public static void main (String args[]) {

        System.out.println("sum of first and last digits is " + sumFirstAndLastDigit(432));
    }

    public static int sumFirstAndLastDigit(int number){

        if(number<0){

            return -1;
        }

        else{
            int lastDigit= number%10;
            int firstDigit=0;
            while(number!=0){
                firstDigit =number;
                number/=10;
                }

            return firstDigit + lastDigit;
            }
        }


    }

