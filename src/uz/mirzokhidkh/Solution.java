package uz.mirzokhidkh;

public class Solution {

    //    Задано рекуррентное соотношение
//    f(n) =  f(n+3) - f(n+2)
//    f(1) = 1
//    f(2) = 2
//    f(3) = 3
//    Написать программу вычисляющую сумму первых 100 элементов последовательности.
//    Ответом должен быть архив с кодом и значение вычисленной суммы поделенное по модулю на 10000.
    public static void main(String[] args){
        System.out.println(func(4));
    }


    public static int func(int n) {
        if (n < 4) return n;

        return func(n - 3) - func(n - 2);
    }

}
