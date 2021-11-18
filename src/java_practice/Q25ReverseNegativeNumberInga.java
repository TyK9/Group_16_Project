package java_practice;

public class Q25ReverseNegativeNumberInga {

    // write  a return method that can reverse negative numbers and return it as int

    public static int reverseNegative(int negative){

        int result = 0;
        boolean isNegative = negative < 0;

        if( isNegative ){
            result = negative * (-1);


        }else{
            System.out.println("this method only accepts negative numbers");

        }
        return result;

    }


    //main
    public static void main(String[] args) {

        int num = -20;

        System.out.println(reverseNegative(num));


    }



}
