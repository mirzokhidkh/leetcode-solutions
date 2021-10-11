package uz.mkhasanov;

import javax.xml.bind.SchemaOutputResolver;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
