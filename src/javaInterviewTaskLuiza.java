public class javaInterviewTaskLuiza {

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
        System.out.println(removeDuplicate("AAABBBCCC"));
    }

    // FrequencyOfCharacters

    public static String frequencyOfCharacters(String health) {

        String output = "";
        String[] character = health.split("");

        for (String eachWord : character) {
            int counter = 0;
            for (String each : character) {
                if (each.equals(eachWord)) {
                    counter++;
                }
            }
            if (!output.contains(eachWord)) { //
                output += eachWord + counter;
            }
        }
        return output;
    }

//    /*
//1)
//I started with PUBLIC STATIC STRING that a return type of method, and i am  going to call it Frequency Of Characters. We have output "AAABBCDD" for that we need give String name jaguarHealth,or anything you like to call.
// 2)
//I initialized in String nothing, an empty output .
//3)
//So this approach need to get each individual character and store it in ARRAY - String Array this i called SurgicalCharacter next i need an array of characters so how to do this it need String name jaguarHealth.split( "" ) -
//
//now i did my for loop , this one i go call each and i am taking it from character array , so this loop will allow me to get one of these character and start compare it with rest of this String , but for that i need to count the number of occurrences, so i declared a COUNTER for those appearances
//
//And loop again, because i grab the first but i have to compare it to the rest of the letter.
//so i used for each loop from again my characters,
//
//So first loop is just to get each character, and the second loop it to go through the String "AAABBCDD" so i can compare whatever i am getting to the rest charters in the String
//
//So now IF each characters what i have is equal to the one that i get initially from the other loop wich is called EachWord then i incremented my counter. After i finish inner loop i did build my output .
//
//so If my output doesn't contain that letter will added, because my output is empty that will add to my final output So each words concatenate it to the number of occurrences that it find
//
//and in the end just return output, cuz we created return method,
//     */
// }
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
//         */
//
//    }
//
//
//}
