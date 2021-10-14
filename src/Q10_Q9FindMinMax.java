import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q10_Q9FindMinMax {

    public static void main(String[] args) {
       


/*
Q10:Array -- Find Minimum:
Write a method that can find the minimum number from an int Array.

*/
        int[] arrMin = new int[]{34, 45, 21, 12, 54, 67, 17}; // i gave 7 random numbers to my Array
        Arrays.sort(arrMin); //in this line sorted elements
        System.out.println("Minimum number from an int Array is: " + arrMin[1]);  // here I am asking to give me first element from arr
/*
Q9:Array -- Find Maximum:
Write a method that can find the maximum number from an int Array.

 */
        int[] arrMax = new int[]{17, 25, 88, 16, 33, 2, 599}; // here same i have given random numbers to my Array
        Arrays.sort(arrMax); // this line sorted my elements
        System.out.println("Maximum number from an int Array is: "+ arrMax[6]);  //  I am asking to give me last element from Array

 /*
Q8:String -- sum of digits in a string:
Write a method that can return the sum of the digits in a string.+

         */



    }
    public static int IndexMaxElement(int[] list, int elements) {
        int maxIndex = 0;
        for (int i = 1; i < elements; i++) {
            if (list[maxIndex] < list[i]) {
                maxIndex = i;

            }
        }
        return maxIndex;
    }}


