package java_practice;


public class FinRaInga {
    public static void main(String[] args) {

        // print nums from 1-30
        // if num is divisible by 3 -> FIN
        // if num divisble by 5 -> RA
        // if both -> FINRA

        for( int i = 1; i <= 30; i++){

            if( i % 3 == 0 && i % 5 == 0){
                System.out.print(" FINRA ");

            }else if( i % 5 == 0){
                System.out.print(" RA ");
            }else if(i % 3 == 0){
                System.out.print(" FIN ");
            }else{
                System.out.print(" "+i+" ");
            }





        }





    }
}
