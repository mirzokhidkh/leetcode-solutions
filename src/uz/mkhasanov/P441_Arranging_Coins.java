package uz.mkhasanov;

public class P441_Arranging_Coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(2147483647));
    }

    public static int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (n == curr) {
                return (int) k;
            }

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }

        return (int) right;

    }


}
