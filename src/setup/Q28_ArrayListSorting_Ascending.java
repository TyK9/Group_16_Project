package setup;

import java.util.*;

public class Q28_ArrayListSorting_Ascending {


    public static void main(String[] args) {
//        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("p","c","h","l","t","d","e","a","z","f"));
//        Collections.sort(alphabet);
//        System.out.println(alphabet);;

//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(8,3,90,4,7,5,2,1));
//        Set<Integer> unique = new HashSet<>(nums);
//        System.out.println(unique);



        //  ArrayList<String> ArrayList = new ArrayList<>();

//        list.add("A");
//        list.add("R");
//        list.add("L");
//        list.add("G");
//        list.add("P");
//        list.add("I");
//        list.add("B");
        //System.out.println("Unsorted ArrayList: "+ list);
        // Collections.sort(list);
        //System.out.println("Sorted ArrayList: "+ list);


        ArrayList<Integer> arraylist = new ArrayList<>(); //

        arraylist.add(5);
        arraylist.add(-8);
        arraylist.add(5100);
        arraylist.add(-513);
        arraylist.add(13);
        arraylist.add(1);
        arraylist.add(17);

        //I use the set() method is used to replace any particular element
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {

                    int tmp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, tmp);
//                    int tmp = arraylist.get(i);
//                    arraylist.get(i) = arraylist.get(j);
//                    arraylist.get(j) = tmp;
                    //  System.out.print(tmp+", ");
                } } }for (int i : arraylist) {
            System.out.print(i+", ");
      }


    }}

