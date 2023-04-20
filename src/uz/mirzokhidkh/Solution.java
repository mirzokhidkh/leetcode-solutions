package uz.mirzokhidkh;

import java.util.Arrays;

public class Solution {

    //    Задано рекуррентное соотношение
//    f(n) =  f(n+3) - f(n+2)
//    f(1) = 1
//    f(2) = 2
//    f(3) = 3
//    Написать программу вычисляющую сумму первых 100 элементов последовательности.
//    Ответом должен быть архив с кодом и значение вычисленной суммы поделенное по модулю на 10000.
    public static void main(String[] args) {
        checkForMehtodGetFilladmlaf();
    }

    private static void checkForMehtodGetFilladmlaf() {
        boolean check = check(
                new String[]{null, "121313", "lsmlad"},//56a
                new String[]{null, "", null},//56b
                new String[]{null, null, null}//56c
        );


        if (check){
            check = check(
                    new String[]{null, "121313", "lsmlad"},//57a
                    new String[]{null, "", null},//57b
                    new String[]{null, null, null}//57c
            );
        }else {
            System.out.println("56a 56b da xato ");
        }


        if (check) {
            check = check(
                    new String[]{null, "121313", "lsmlad"},//58a
                    new String[]{null, "", null},//58b
                    new String[]{null, null, null}//58c
            );
        }  else {
            System.out.println("57 larda  ");
        }
    }

    public static boolean check(String[]... strs) {
        int count = 0;

        for (String[] str : strs) {
            System.out.println(Arrays.toString(str));
            for (String s : str) {
                if (count == 1 && s != null) {
                    System.out.println("ERROR");
                    return false;
                }
                if (s != null) {
                    count = 1;
                    break;
                }
            }
        }
        return count == 1;

    }
}
