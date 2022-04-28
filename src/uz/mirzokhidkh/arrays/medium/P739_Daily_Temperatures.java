package uz.mirzokhidkh.arrays.medium;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Stack;

public class P739_Daily_Temperatures {

    public static void main(String[] args) throws ParseException {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();


        for (int curDay = 0; curDay < n; curDay++) {
            int curTemp = temperatures[curDay];

            while (!stack.isEmpty() && temperatures[stack.peek()] < curTemp) {
                int prevDay = stack.pop();
                ans[prevDay] = curDay - prevDay;
            }
            stack.push(curDay);

        }

        return ans;
    }


//      APPROACH-1

//    public static int[] dailyTemperatures(int[] temperatures) {
//        int n = temperatures.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int dif = 0;
//            for (int j = i + 1; j < n; j++) {
//                dif = temperatures[j] - temperatures[i];
//                if (dif > 0) {
//                    ans[i] = j - i;
//                    break;
//                }
//            }
//        }
//
//        return ans;
//    }

}
