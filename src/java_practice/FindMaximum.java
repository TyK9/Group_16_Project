package java_practice;

public class FindMaximum {

    /*
        Pseudocode
    First we create an int variable which will hold our return value, and we give an initial value of the first element of   given array.
    Then we use a for each loop to read through each element of given array.
    Inside the loop, we will use an if statement which will check if each element is BIGGER than variable result.
    And if it is, result will be reassigned value of each.
    When the loop is done reading through each element.
    Outside of loop we give return value of result.

     */

    public static int getMaximumNumber( int [] arr){

        int result = arr[0];

        for( int each : arr){

            if(each > result){

                result = each;
            }
        }

        return result;
    }


    // ----> executing method in main

    public static void main(String[] args) {

        int [] arr = { 5 , 30, 6, 2, 1 };

        System.out.println(getMaximumNumber(arr));




    }

}
