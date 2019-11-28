
public class sharedDigit {


    public static void main(String Args[]) {

        System.out.println("the shared digits are " + hasSharedDigit(33, 44));

    }


    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }
        int temp = b;
        while (a > 0) {
            int lastA = a % 10;
            System.out.println("A : " + lastA);
            b = temp;
            while (b > 0) {
                int lastB = b % 10;
                System.out.println("B : " + lastB);
                if (lastA == lastB) {
                    return true;
                }
                b /= 10;
            }
            a /= 10;
        }
        return false;
    }
}