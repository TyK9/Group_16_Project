package java_practice;

public class SumOfStringNums {
    public static void main(String[] args) {



                String s = "asdsa35sdas123";
                int total =0;
                char [] c = s.toCharArray();
                for(int i = 0; i < c.length; i++){



                    if(Character.isDigit(c[i])){
                        System.out.print("Digits in the String : " + c[i]);
                        System.out.println();

                        int a = Integer.parseInt(String.valueOf(c[i]));
                        total += a;


                    }

                }
                System.out.println("Sum of digits : " +total);



            }
        }


