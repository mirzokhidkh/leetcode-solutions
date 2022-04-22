package uz.mkhasanov;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);


    }

}