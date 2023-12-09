package uz.mirzokhidkh.adventofcode.y2023.day09;

import java.util.Stack;

public class Util {

    public static int[] createNextSequence(int[] curSeq) {
        int[] nextSeq = new int[curSeq.length - 1];

        for (int i = 1; i < curSeq.length; i++) {
            nextSeq[i - 1] = curSeq[i] - curSeq[i - 1];
        }

        return nextSeq;
    }

    public static boolean areAllZero(int[] arr) {
        for (int i : arr) {
            if (i != 0) return false;
        }
        return true;
    }

    public static int extrapolateNextVal(Stack<Integer> stack) {
        int nextVal = stack.pop();

        while (!stack.isEmpty()) {
            nextVal += stack.peek();
            stack.pop();
        }
        return nextVal;
    }

    public static int extraPolatePrevVal(Stack<Integer> stack) {
        int nextVal = stack.pop();

        //
        while (!stack.isEmpty()) {
            nextVal = stack.peek() - nextVal;
            stack.pop();
        }

        return nextVal;
    }
}
