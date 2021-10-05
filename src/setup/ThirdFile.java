package setup;

import java.util.Scanner;

public class ThirdFile {
    public static String makeReverse(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();

        String reverse = "";

        for (int i = 0; i <= word.length()-1; i++) {

            reverse = word.charAt(i) + reverse;
        }
        return reverse;

    }
    public static void main(String[] args) {
        System.out.println(makeReverse());
    }
}

