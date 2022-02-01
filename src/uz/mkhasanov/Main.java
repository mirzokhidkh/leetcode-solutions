package uz.mkhasanov;

import java.io.IOException;
import java.text.ParseException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }


    



}
