package uz.mirzokhidkh.adventofcode.y2023.day09;

import java.util.Arrays;
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

        //declarative approach
        return !Arrays.stream(arr).allMatch(value -> value == 0);


        //imperative approach
//        for (int i : arr) {
//            if (i != 0) return false;
//        }
//        return true;
    }

    public static int extrapolateNext(Stack<Integer> stack) {
        int curNextVal = 0;
        while (!stack.isEmpty()) {
            curNextVal += stack.pop();
        }
        return curNextVal;
    }

    public static int extrapolateBackwards(Stack<Integer> stack) {
        int curLeftMostVal = 0;
        while (!stack.isEmpty()) {
            curLeftMostVal = stack.pop() - curLeftMostVal;
        }
        return curLeftMostVal;
    }
}
