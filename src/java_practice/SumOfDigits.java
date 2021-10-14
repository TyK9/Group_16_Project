package java_practice;

public class SumOfDigits {

    /*
        PseudoCode

        in the method we first make an int variable with default value of 0
        then we use a for loop to go through the given string one element at a time,
        inside the loop we create another int variable name num, and to this variable we assign
        the int value of the element at every iteration.
        To do that we use the Integer parseInt method, which converts the String digit into an int digit
        Then we add the value of num to our sum.
        The process keeps repeating until the end of the String.
        Outside of the loop we give variable sum as return value.

     */

    public static int sumOfDigits( String str){

        int sum = 0;

        for(int i = 0; i < str.length(); i++){


            int num = Integer.parseInt( str.substring(i,i+1));

            sum+= num;

        }

        return sum;

    }

    public static void main(String[] args) {

        String str = "22589315";


        System.out.println(sumOfDigits(str));





    }

}
