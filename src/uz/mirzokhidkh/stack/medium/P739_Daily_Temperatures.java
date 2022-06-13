package uz.mirzokhidkh.stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class P739_Daily_Temperatures {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int curDay = 1; curDay < temperatures.length; curDay++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[curDay]) {

                int prevDay = stack.pop();

                temperatures[prevDay] = curDay - prevDay;
            }

            stack.push(curDay);

        }


        while (!stack.isEmpty()) {
            temperatures[stack.pop()] = 0;
        }

        return temperatures;

    }


}
