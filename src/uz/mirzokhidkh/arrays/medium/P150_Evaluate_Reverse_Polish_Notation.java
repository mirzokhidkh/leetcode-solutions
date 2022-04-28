package uz.mirzokhidkh.arrays.medium;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class P150_Evaluate_Reverse_Polish_Notation {

    public static void main(String[] args) throws ParseException, IOException {

        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

    }


    public static int evalRPN(String[] tokens) {
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (operators.contains(token)) {
                Integer top = stack.pop();
                Integer prevTop = stack.pop();
                stack.push(calculate(prevTop, top, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    public static int calculate(int a, int b, String operator) {
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
        return 0;
    }

}
