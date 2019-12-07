public class Prime {

    public static void main(String Args[]){

        System.out.println(" The largest Prime Factor of a given number is " + getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        int i;
        if(number <2){
            return -1;
        }
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }
}