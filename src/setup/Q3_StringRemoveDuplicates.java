package setup;

public class Q3_StringRemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
    }


    //String remove Duplicates

    public static String removeDuplicate(String  str) {
        String output = "";

        for (String each : str.split("")) {
            if (!output.contains(each)) {
                output += each;

            }
        }
        return output;
    }}
//        /*
//        // this Remove Duplicate same idea like a Frequency method  use that same approach and get functional that will get return a String , inside parentheses i put String and named the String.
//        Next step i need to declare an output , initialize nothing ,
//
//        I am using here for each loop , and how i can get each character out of the string ? - its by splitting that string into array of character . So for each loop will do all the calculations so we dont have to worry about indexes or anything, how we going to do that , we will give string that we were going to be working on and split it, so what we will splitting its each character so it will be empty quotation mark, this will give me an array of individual characters as a strings. Now i will do If my output doesnt contain that letter it start building it add it. Because if it finds it again - i already have it , i dont need them anymore in that way i will remove the duplicates
//
//
//
//        in the end we have to return output , the other way it wont work, because i started with return method
//
//
//
//

