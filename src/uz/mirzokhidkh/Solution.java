package uz.mirzokhidkh;

import java.util.Objects;
import java.util.Stack;

public class Solution {

    //    Задано рекуррентное соотношение
//    f(n) =  f(n+3) - f(n+2)
//    f(1) = 1
//    f(2) = 2
//    f(3) = 3
//    Написать программу вычисляющую сумму первых 100 элементов последовательности.
//    Ответом должен быть архив с кодом и значение вычисленной суммы поделенное по модулю на 10000.
    public static void main(String[] args) {

        System.out.println(8 << 1);
        System.out.println(8 >> 1);
        System.out.println(3  >> 1);
        System.out.println(5  >> 1);
        System.out.println(4  >> 1);
        System.out.println(6 << 1);

        int n =3;
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;
            System.out.print(bit+"-");
        }





    }


}
