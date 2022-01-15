package uz.mkhasanov;

import java.text.ParseException;

public class Solution {

    public static void main(String[] args) throws ParseException {
        System.out.println(solution(6, 11, 2));//3
        System.out.println(solution(0, 2000000000, 1));//2000000001
        System.out.println(solution(0, 1, 11)); //1
        System.out.println(solution(1, 1, 11)); //0
        System.out.println(solution(10, 10, 5));//1
        System.out.println(solution(10, 10, 11));//0
        System.out.println(solution(10, 10, 7));//0
        System.out.println(solution(11, 13, 2));//1
    }

    public static int solution(int A, int B, int K) {
        int res = 0;
        int dif = (B - A);
        if (dif > K) {
            res = dif / K + 1;

        } else {
            return A % K == 0 ? 1 : 0;
        }
        return res;
    }

//    public static int solution(int A, int B, int K) {
//
//        int max = B / K;
//        int min = A > 0 ? (A - 1) / K : 0;
//
//
//        return A == 0 ? max - min + 1 : max - min;
//    }


}
