package setup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q16_ConcatArray {

    public static void main(String[] args) {


        int[] array1 = {6, 3, 5};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length; //// we store the total length require to result

        int[] result = new int[length]; //Create a new array result of the length
        int index = 0;

       // Now, we use the for each loop to iterate through each element of array1 and store it in the result. After assigning , we increase the position pos by 1.
        for (int each : array1) { //
            result[index] = each;
            index++; //we increasing index
        }
//we do the same for array2 and store each element in result starting from the position after array1.
        for (int each2 : array2) {
            result[index] = each2;
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}
