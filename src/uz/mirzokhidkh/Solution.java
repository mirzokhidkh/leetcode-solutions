package uz.mirzokhidkh;

import java.util.*;

public class Solution {
    static Map<Character,Character> map = new HashMap<Character, Character>(){
        {
            put('(',')');
            put('{','}');
            put('[',']');
        }
    };
    public static void main(String[] args) {

        System.out.println(map.containsKey('{'));

        Stack<Character> stack = new Stack<>();
        System.out.println(stack.peek());


    }


}
