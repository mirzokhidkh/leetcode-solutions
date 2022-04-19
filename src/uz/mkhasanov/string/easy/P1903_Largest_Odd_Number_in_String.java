package uz.mkhasanov.string.easy;

public class P1903_Largest_Odd_Number_in_String {

    public String largestOddNumber(String num) {
        String sub = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                for (int j = 0; j < i + 1; j++) {
                    sub = num.substring(j, i + 1);
                    if ((Integer.parseInt(sub.substring(sub.length() - 1)) % 2 != 0)) {
                        return sub;
                    }
                }
            }
        }
        return "";
    }
}
