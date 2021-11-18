package java_practice;

public class IngaDivideWithoutDivision {



    // main

    public static void main(String[] args) {

        System.out.println(divide(3,10));


    }

    // the method

    public static double divide(int dividend, int divisor) {

        int quotient = 0;
        String msg = "Invalid divisor";


        if(divisor == 0){
            System.out.println(msg);
        }


        if(dividend > 0) {
            while (dividend >= 0) {

                dividend = dividend - divisor;
                quotient++;
            }

        }else{

            while(dividend < 0){

                dividend = dividend + divisor;
                quotient++;

            }
            quotient= quotient * -1;

        }

        return quotient;

    }


}
