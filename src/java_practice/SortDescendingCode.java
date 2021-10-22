package java_practice;

import java.util.Arrays;

public class SortDescendingCode {


    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));


    }


    public static int[] sortDescending(int[] y) {
        int temp = 0;
        for (int i = 0; i < y.length; i++) {

            for (int j = i; i < y.length; i++) {

                if (y[i] > y[j]) {
                    temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;

                }


            }

        }
        for (int a : y) {

            System.out.print(a + " ");
        }

        return y;

    }
    }

