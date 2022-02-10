package setup;

public class Q8StringSumOfDigits {

    /*Q8:String -- sum of digits in a string:
    Write a method that can return the sum of the digits in a string.+

            */

    public static void main(String[] args) {


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

