package java_practice;

import java.util.Arrays;

public class SameLetters {
    /*
    Write a return method that returns boolean
   Parameters: two Strings
   The method will compare Strings and see if they are anagram
   If yes, return true
   If no, return false

     */

    /*
    Pseudo Code:

    First step is to use keywords public and static and give return type boolean, followed
    by the name of the method.
    Inside the parenthesis we will give two String variables named word1 and word2 as parameters.

    The methods will check the two given String values and will return us true or false.
    If the two given Strings contain the exact same letters, the method will return true
    , if not, it will return false.

    In the body of the method, we will first use the toLowercase() method to make sure every character
    of both Strings are lowercase, to avoid any conflicts.

    The next step is to create two separate char arrays out of the given Srings by using
    the toCharArray()  method. Then we can use the Arrays.sort method from the java.util.Arrays class
    to sort each array.

    Next step is to declare a boolean variable named isAnagram and assign a default value of false.
   Then we wil use an if statement, and inside we will check if the two arrays are equal, by using
   the Arrays.equals method from the imported class. The body of the if statement will reassign a true value
   to isAnagram boolean.

    The last step is to give the return isAnagram outside of  if statement.
     */

    public static boolean isAnagram(String word1, String word2) {

        // convert Strings to char array to be able to compare each character

        word1 =  word1.toLowerCase();
        word2 =  word2.toLowerCase();

        char [] oneAr = word1.toCharArray();
        char [] twoAr = word2.toCharArray();

        // sort the characters in order
        Arrays.sort(oneAr);
        Arrays.sort(twoAr);

        boolean isAnagram = false;

        if(Arrays.equals(oneAr,twoAr)){
            isAnagram = true;

        }

        return isAnagram ;

    }

}
