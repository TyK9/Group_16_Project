package java_practice;

import java.util.Arrays;

public class IngaMergingTwoArrays {

    // main method to check
        public static void main(String[] args) {
            int  [] arr1={1,2,3,4,5};
            int [] arr2={6,7,8,9,10};
            System.out.println(Arrays.toString(merge(arr1,arr2)));
        }

        public static int [] merge(int [] arr1,int [] arr2){

            int [] result=new int[arr1.length+arr2.length];
            int index=0;
            for (int i = 0; i <arr1.length ; i++) {
                result[i]=arr1[i];
                index++;
            }
            for (int i = 0; i <arr2.length ; i++) {
                result[index]=arr2[i];
                index++;
            }

            return result;
        }
    }

