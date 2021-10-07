package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    /*
    Q1: String -- Frequency of Characters
Write a return method that can find the frequency of characters Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    /*
    Pseudo Code:

        First we need to use the keywords public static and return type which is String,
        then we give the method name, and inside  the parenthesis we will give the parameter,
        which is a given String.
        The method will check the String input, and return us a String showing each character and its
        frequency.

        In the body of the method, we create an ArrayList out of the given String str, by using the split          method. Then we create an empty String variable named result. We will concatenate the result into
        this variable.

        The next step is to create a for each loop which will read through each element of the ArrayList we
        made earlier. Inside the loop, we will use an if statement with a boolean that will check if result
        does not contain each(which represent the element at current iteration).

        If boolean is true, inside the if statement we will create an int variable named count which will
        equal to the frequency of each character in arraylist.

        We use the frequency method from the java.util.Collections class to check this.

        Then we use the shorthand operator to concatenate each element of arrayList with the count, which
        would be its frequency.

        The last step is to use return keyword with result variable outside the loop.


     */

    public static String frequencyOfCharacters(String str){

        // How do we convert String to ArrayList

        /*
        We start with the str = AABBCCDD
            String [] arr = str.split(""); -> ["A", "A", "A" etc ...


            str is what is given as parameter in method
        */

        ArrayList<String> list = new ArrayList<>(Arrays.asList( str.split("")));

        String result = "";

        for( String  each : list ){

            if(!result.contains(each)){

                int count = Collections.frequency(list, each);

                result +=  each + count;
            }
        }
        return result ;

    }

    public static void main(String[] args) {


        System.out.println(frequencyOfCharacters("AAABBBDDDFF"));




    }
}
