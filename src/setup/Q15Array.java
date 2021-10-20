package setup;

public class Q15Array {

        /*
        I wrote a code to move all zeroes to end of array in-place (without using any extra space). Basically, we are going to write a code which shift all zeros to right of array.
         */

    public static void moveZeroes(int[] arr) { // Created Void method, this method doesn't return a value

        int count = 0;

        for(int i = 0; i < arr.length; i++) { // in first loop checks how many 0 have i arr length and counted line 14
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            } }

        //Now, remaining element is zero.
        while(count < arr.length) {
            arr[count++] = 0; }

        for(int j = 0; j < arr.length; j++) { //
            System.out.print(arr[j]);
        } }
    public static void main(String[] args) {

        int arr[] = {1,0,2,0,3,0,4,0};
        moveZeroes(arr);
    }
}
