package java_practice;

import java.util.ArrayList;
import java.util.Collections;

public class InterviewSortingNumsAndLetters {

    public static String sortingString(String str) {

        // DC501GCCCA098911

        String nums = "0123456789";
        String result = "";
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (nums.contains("" + str.charAt(i))) {
                arr.add(str.charAt(i) + "");
                if ( (i+1)<str.length() && !nums.contains("" + str.charAt(i + 1)) || (i+1) == str.length()) {
                    Collections.sort(arr);
                    result += arr.toString();
                    arr.clear();
                }

            } else if (!nums.contains("" + str.charAt(i))) {
                arr.add(str.charAt(i) + "");
                if ( (i+1)<str.length() && nums.contains("" + str.charAt(i + 1)) || (i+1) == str.length() ) {
                    Collections.sort(arr);
                    result += arr.toString();
                    arr.clear();
                }


            }


        }
        return result.replaceAll("\\[","").replaceAll("]", "" ).replaceAll(",", "").replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(sortingString("DC501GCCCA098911"));


    }

    //correct answer     //CD015ACCCG011899




}
