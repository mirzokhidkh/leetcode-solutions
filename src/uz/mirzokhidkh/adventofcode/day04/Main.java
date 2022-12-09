package uz.mirzokhidkh.adventofcode.day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day04/input.txt"));

        int total1 = 0;

        int total2 = 0;

        while (sc.hasNext()) {
            String strLine = sc.nextLine();

            String[] strings = strLine.split(",");
            String[] first = strings[0].split("-");
            String[] second = strings[1].split("-");
            ;
            int f1 = Integer.parseInt(String.valueOf(first[0]));
            int f2 = Integer.parseInt(String.valueOf(first[1]));
            int s1 = Integer.parseInt(String.valueOf(second[0]));
            int s2 = Integer.parseInt(String.valueOf(second[1]));

            if ((f1 >= s1 && f2 <= s2) || (s1 >= f1 && s2 <= f2)) {
                total1++;
            }

            if (f1 <= s2 && f2 >= s1) {
//                System.out.println(f1 + "-" + f2 + ":" + s1 + "-" + s2);
                total2++;

            }


        }

        System.out.println(total1);
        System.out.println(total2);
    }


}
