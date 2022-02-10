package setup;

import javax.imageio.stream.ImageInputStream;

public class Q21NumDivisible {

    public static void main(String[] args) {
        int n = 100;
        divisibleNum(n);
    }

    static void divisibleNum(int n) {
        // loop iterate from 0 to 100
        String by3 = "";
        String by5 = "";
        String by15 = "";

        for (int i = 1; i < n; i++) {
            // i used if statement or Short circuit operator is used
            if (i % 15 == 0) {
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }
        }
        System.out.println(by15);
        System.out.println(by5);
        System.out.println(by3);

//c - alt - l - mac
    }
}


//                System.out.print(i + " ");
//
//        for (int i = 0; i < n; i++)
//        {
//
//            if (i % 5 == 0 )
//                System.out.print(i + " ");
//        }
//        for (int i = 0; i < n; i++)
//        {
//
//            if (i % 15 == 0 )
//                System.out.print(i + " ");
//    }}}




