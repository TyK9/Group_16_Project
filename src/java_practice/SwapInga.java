package java_practice;

import java.util.Scanner;

public class SwapInga {
    // swap 2 variable values without using a third variable

    public static void main(String[] args) {


        // was only able to figure out how to swap int variables

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 int values:");

        int a = scan.nextInt();
        int b = scan.nextInt();

        // printing initial values
        System.out.println(a+","+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+","+b);








    }
}
