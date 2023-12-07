package uz.mirzokhidkh.adventofcode.y2023.day01;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day01/input"));
        int sum = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();

            int l = 0;
            int r = line.length() - 1;
            while (!Character.isDigit(line.charAt(l)) || !Character.isDigit(line.charAt(r))) {

                if (!Character.isDigit(line.charAt(l))) {
                    l++;
                }

                if (!Character.isDigit(line.charAt(r))) {
                    r--;
                }
            }

            int num = Integer.parseInt("" + line.charAt(l) + line.charAt(r));
            sum += num;
        }
        System.out.println("SUM => " + sum);

    }
}
