package uz.mirzokhidkh.stack.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class P150_Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        List<String> operands = Arrays.asList("+", "-", "*", "/");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!operands.contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, s));
            }

        }

        return stack.pop();
    }


    public int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }

        return -1;
    }


}
