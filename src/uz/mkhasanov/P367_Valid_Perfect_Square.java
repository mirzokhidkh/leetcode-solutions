package uz.mkhasanov;

import java.text.ParseException;

public class P367_Valid_Perfect_Square {

    public static void main(String[] args) throws ParseException {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(11));
    }


    //1-APPROACH
//    public static boolean isPerfectSquare(int num) {
//
//        int i =1 ;
//        while (num>0){
//            num-=i;
//            i+=2;
//        }
//
//        return num==0;
//    }

    //2-APPROACH
    public static boolean isPerfectSquare(int num) {

        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
