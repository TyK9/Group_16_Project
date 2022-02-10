package setup;

import java.util.Arrays;

public class Q10_ArrayFindMinimum {

    public static void main(String[] args) {

    /*
Q10:Array -- Find Minimum:
Write a method that can find the minimum number from an int Array.

*/
        int[] arrMin = new int[]{34, 45, 21, 12, 54, 67, 17}; // i gave 7 random numbers to my Array
        Arrays.sort(arrMin); //in this line sorted elements
        System.out.println("Minimum number from an int Array is: " + arrMin[1]);  // here I am asking to give me first element from arr
    }
}