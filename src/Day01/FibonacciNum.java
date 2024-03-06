package Day01;

import java.util.Arrays;

public class FibonacciNum {
    public static void main(String[] args) {
       // first appraoch using variable and loop
        int first =0;
        int second =1;
        int sun=0;
        for (int i = 0; i <= 5; i++) {
             sun = first+ second;
            first=second;
            second=sun;

            System.out.println(sun);

        }

        // approach two

        int count =10;

        int[] fibNum = new int[count];

        fibNum[0]=0;
        fibNum[1]=1;

        for (int i = 2; i < count; i++) {

            fibNum[i] = fibNum[i-2]+fibNum[i-1];


        }
        System.out.println(Arrays.toString(fibNum));










    }
}
