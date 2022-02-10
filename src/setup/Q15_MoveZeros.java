package setup;

public class Q15_MoveZeros {

        /*
        I wrote a code to move all zeroes to end of array in-place (without using any extra space).  we are going to write a code which shift all zeros to right of array.
         */

    public static void main(String[] args) {

        int arr[] = {1,0,2,6,0,3,0,4,0,0, -1};
        moveZeroes(arr);
    }

// Created Void method, this method doesn't return a value
    public static void moveZeroes(int[] arr) {

        int count = 0;
// in first loop checks how many 0 have i arr length and counted line 14
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) { // here checks if arr[i] are not equals to 0
                arr[count++] = arr[i]; // counting how many element not equals to 0
            } }

        while(count < arr.length) {  //here, remaining element is zero.
            arr[count++] = 0; }

        for(int j = 0; j < arr.length; j++) { //
            System.out.print(arr[j]);
        } }

}
