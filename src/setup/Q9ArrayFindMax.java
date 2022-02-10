package setup;

import java.util.Arrays;

public class Q9ArrayFindMax {
    public static void main(String[] args) {



    //Q9:Array -- Find Maximum:
    //Write a method that can find the maximum number from an int Array.


    int[] arrMax = new int[]{17, 25, 88, 16, 33, 2, 599}; // here same i have given random numbers to my Array
        Arrays.sort(arrMax); // this line sorted my elements
        System.out.println("Maximum number from an int Array is: "+ arrMax[6]);  //  I am asking to give me last element from Array
}
}