package setup;

import java.util.Arrays;

public class Q13_UniqueInteger {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumToZero(n)));

    }
    public static int [] sumToZero (int n){
        int [] result = new int [n];
        int sum =0;
        for (int i =0; i < n; i++){
            result[i] =i ;
            sum += i; // adding them together
        }
        result[n-1] = -sum;
        return result;
    }
}