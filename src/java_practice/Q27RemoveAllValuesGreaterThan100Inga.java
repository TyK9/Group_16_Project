package java_practice;

import java.util.ArrayList;
import java.util.Arrays;


public class Q27RemoveAllValuesGreaterThan100Inga {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,20,200,30,22,1, 1000,500,2));

        System.out.println(nums);


        nums.removeIf( n -> n > 100 ); // using predicate lambda expression

        System.out.println(nums);


    }
}
