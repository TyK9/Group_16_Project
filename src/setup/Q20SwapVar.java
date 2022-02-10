package setup;

public class Q20SwapVar {

    public static void main(String[] args) {
int first = 10;
int second = 3;
        System.out.println(first + " " + second); // giving numbers before swap

        first = first - second; // we are reassigning value of variable first
        second = first + second;// we are reassigning value of variable second
        first = second - first; //we are reassigning value of variable first


        System.out.println(first + " " + second); // after swap
    }
}
