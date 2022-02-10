package setup;

import java.util.HashSet;
import java.util.Set;

public class Q14_Permutation {

    public static void main(String[] args) {

        String [] arr = {"A", "B", "C"};
        String result = "";

        for(int i =0; i< arr.length; i++){

            for(int j =0; j < arr.length;j++){

                for (int k = 0; k < arr.length; k++){

                    if(i != j && i != k && j != k){
                        result += arr[i] + arr[j] + arr[k] + " ";
                    }
                }
            }
        }
        System.out.println(result);
    }


//    public static Set<String> permutationFinder(String str) {
//        Set<String> perm = new HashSet<String>();
//        if (str == null) {
//            return null;
//        } else if (str.length() == 0) {
//            perm.add("");
//            return perm;
//        }
//        char initial = str.charAt(0);
//        String rem = str.substring(1);
//        Set<String> words = permutationFinder(rem);
//        for (String strNew : words) {
//            for (int i = 0;i<=strNew.length();i++){
//                perm.add(insertChar(strNew, initial, i));
//            }
//        }
//        return perm;
//    }
//
//    public static String insertChar(String str, char c, int j) {
//        String begin = str.substring(0, j);
//        String end = str.substring(j);
//        return begin + c + end;
//    }
//    public static void main(String args[]){
//        String s1 = "ABC";
//        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
//    }
//



}
