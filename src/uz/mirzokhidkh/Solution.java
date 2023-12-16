package uz.mirzokhidkh;

import java.util.Objects;

public class Solution {

    //    Задано рекуррентное соотношение
//    f(n) =  f(n+3) - f(n+2)
//    f(1) = 1
//    f(2) = 2
//    f(3) = 3
//    Написать программу вычисляющую сумму первых 100 элементов последовательности.
//    Ответом должен быть архив с кодом и значение вычисленной суммы поделенное по модулю на 10000.
    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE);

//        String name = "baeldung";
//        String newName = name.replace("dung", "----");
//
//        System.out.println(name);
//        System.out.println(newName);

//        String s = "qwerty";
//        System.out.println( !s.equals(".") && s.matches("[^A-Za-z0-9 ]"));

//        System.out.println(s.substring(0,2));
//        StringBuilder builder = new StringBuilder();
//
//        builder.append(1);
//
//        System.out.println(builder.toString());
//        System.out.printf("pipes[%s][%s] = %s", 1, 1,11);


//        int i = 73;
//
//        switch (i){
//            case 1,2:
//                System.out.println(i+"case-1-2");
//                break;
//            case 3:
//                System.out.println(i+"-case-3");
//            default:
//                System.out.println("WS");
//        }

        char i = '/';

        switch (i){
            case '/':
                System.out.println(i+"case-1");
                break;
            case '\\':
                System.out.println(i+"-case-2");
                break;
            default:
                System.out.println("WS");
        }
    }


}
