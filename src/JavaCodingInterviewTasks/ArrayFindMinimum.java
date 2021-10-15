package JavaCodingInterviewTasks;

import java.util.Arrays;

public class ArrayFindMinimum {
    public static void main(String[] args) {

        int [] output = {23,89,568,78,34};

        System.out.println(minNumber(output));

        System.out.println(minNumber2(output));
    }

    //method 1
    public static int minNumber(int [] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    //method 2
    public static int minNumber2(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
