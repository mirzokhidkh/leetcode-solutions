package uz.mkhasanov;

import java.io.IOException;
import java.text.ParseException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        int a = 7, b = 5;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
//        System.out.println(a);
//        System.out.println(b);
    }

}
