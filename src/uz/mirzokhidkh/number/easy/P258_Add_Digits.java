package uz.mirzokhidkh.number.easy;

public class P258_Add_Digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {

        int res = 0;
        while (num > 0) {
            res += num % 10;

            if (res > 9 && num == 0) {
                num = res;
                res = 0;
            }
        }

        return res;
    }

}
