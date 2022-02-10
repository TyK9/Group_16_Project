package setup;

public class Q25ReverseNumNegative {
/*
Q25: Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

 */
    public static void main(String[] args) {
        int [] num ={-1, -35, -77, -63};
        //reverseN(num);
    }
    public static int reverseN (int num) {
        int reverse = 0;
        for (int i = -1; i>=num; i--){
            reverse += num;
            System.out.println(reverse);

            }return reverse;
        }


}
