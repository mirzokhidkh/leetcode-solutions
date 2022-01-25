package uz.mkhasanov.string.easy;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20_Valid_Parentheses {

    public static void main(String[] args) throws ParseException {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("{[]}"));
    }

    static Map<Character, Character> map = new HashMap<Character, Character>() {
        {
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }
    };

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        int i = 1;
        while (i < s.length()) {
            Character last = !stack.isEmpty() ? stack.peek() : null;
            char c = s.charAt(i);
            if (map.containsKey(last) && map.get(last) == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
            i++;
        }

        return stack.isEmpty();
    }


}
