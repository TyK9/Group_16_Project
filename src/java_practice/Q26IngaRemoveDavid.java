package java_practice;


import java.util.ArrayList;
import java.util.Scanner;

public class Q26IngaRemoveDavid {

    //Given ArrayList of String names, remove all Davids

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);


        ArrayList<String> names = new ArrayList<>();

        String keepGoing = "yes";

        while (keepGoing.equalsIgnoreCase("yes")){
            keepGoing = "";
            System.out.println("Give a name");
            names.add(scan.nextLine());
            System.out.println("Do you want to keep going?");
            keepGoing = scan.nextLine();

            }


        System.out.println(names);

        for (int i = 0; i < names.size(); i++){

            if(names.get(i).equals("David")){
                names.remove("David");
            }
        }


        System.out.println(names);



    }

    }



