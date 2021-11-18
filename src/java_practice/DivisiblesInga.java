package java_practice;

import java.util.ArrayList;

public class DivisiblesInga {
    // write program that prints nums from 1-100
    // categorize nums based on if they are divisble by 3, 5, 15
    // create 3 arrayLists that hold 3 types of values


    public static void main(String[] args) {

        ArrayList<Integer>divisibleBy3= new ArrayList<>();
        ArrayList<Integer>divisibleBy5= new ArrayList<>();
        ArrayList<Integer>divisibleBy15= new ArrayList<>();

        for(int i = 1; i <=100; i++){

            if(i % 15 == 0){
                divisibleBy15.add(i);
            }else if( i % 5 == 0){
                divisibleBy5.add(i);
            }else if( i  % 3 == 0){
                divisibleBy3.add(i);
            }
        }


        System.out.println("Divisible by 15: "+divisibleBy15);
        System.out.println("Divisible by 5: "+divisibleBy5);
        System.out.println("Divisible by 3: "+divisibleBy3);

    }


}
