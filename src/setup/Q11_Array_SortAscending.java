package setup;

import java.util.Arrays;

public class Q11_Array_SortAscending {

    public static void main(String[] args) {
        int [] arr = {10, 9, 8, 7};

    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 1; j < arr.length - 1; i++) {
            if (arr[i] > arr[j]) { //swap if arr[i] greater than arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println(arr);


}}
