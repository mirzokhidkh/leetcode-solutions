package uz.mirzokhidkh.number.easy;

public class P507_Perfect_Number {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(61));
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i * i != num) {
                    sum += num / i;
                }
            }

        }
        return sum-num == num;
    }

}
