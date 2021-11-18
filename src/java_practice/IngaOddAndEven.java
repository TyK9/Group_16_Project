package java_practice;

public class IngaOddAndEven {

    public static void main(String[] args) {

        System.out.println(oddOrEven(22));


    }


    public static String oddOrEven(int num){

        String result ="";

        if( num % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }

        return result;
    }



}
