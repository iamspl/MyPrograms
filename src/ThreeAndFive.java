public class ThreeAndFive {

    public static void main(String Args[]){

        int count = 0;
        int sum = 0;
        for(int i=0;i<1000;i++){

            if((i % 3==0)&&(i%5 == 0)){

                count++;
                sum+=i;
                System.out.println("sum of the number is = " + i );
            }

            if(count == 8 ){

                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
