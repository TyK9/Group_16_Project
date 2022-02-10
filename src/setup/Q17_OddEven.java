package setup;

public class Q17_OddEven {

    public static void main(String[] args) {
        int number = -2;

        if(number%2==0){

            System.out.println("is even");
        }else{
            System.out.println("is odd");


        }

    }

    public static String evenOdd(int n){
        return n % 2 ==0 ? "Even" : "Odd"; // fancy method

    }
}
