package java_practice;

import java.util.Arrays;

public class MoveZerosInga {
    /*
    Move all the zeros to the end
     */

    public static void moveZerosToEnd(int [] arr) {

    String zeroStr = "";
    String numStr = "";

    int [] result = new int[arr.length];

    for( int each : arr){

        if(each == 0){
            zeroStr+= each+" ";
        }else{
            numStr += each+" ";
        }

    }
    String combined = numStr+zeroStr;
    String [] strArr = combined.split(" ");

    for(int i =0; i < arr.length; i++){

      int element =   Integer.parseInt(strArr[i]);

        result[i] = element;

    }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {

        int [] nums = { 0,1, 0, 20, 0, 0, 2, 22, 11,0,0};

       moveZerosToEnd(nums);


    }

}
