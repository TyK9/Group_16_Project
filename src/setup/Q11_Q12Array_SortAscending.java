package setup;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class Q11_Q12Array_SortAscending {

    public static void main(String[] args) {
        //int[] arr = {10, 9, 8, 7};
  // int[] arr = {10,20,7, 8, 90}; //Q12 use in line 19
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, -1}; //Q15 use in line 19 <
        System.out.println(Arrays.toString(arr));
        // Sort2(arr);


        //   public static int Sort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // we use for descending
                    int temp = arr[i]; // here is starting sort,  it calls bubble sort it ...
                    arr[i] = arr[j]; // Iam swapping then and using nested for loop to solution
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }}

//return arr.length; // we can return int arr
