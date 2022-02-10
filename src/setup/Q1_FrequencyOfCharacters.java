package setup;

public class Q1_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));

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
    }}

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

//         */
//
//    }
//
//
//}
