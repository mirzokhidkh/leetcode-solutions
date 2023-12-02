package uz.mirzokhidkh.adventofcode.y2023.day01;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Part2 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day01/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day01/test"));
//        String[] digitArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Map<String, Integer> digitMap = new HashMap<>();
        digitMap.put("one", 1);
        digitMap.put("two", 2);
        digitMap.put("three", 3);
        digitMap.put("four", 4);
        digitMap.put("five", 5);
        digitMap.put("six", 6);
        digitMap.put("seven", 7);
        digitMap.put("eight", 8);
        digitMap.put("nine", 9);

        Set<String> digitSet = digitMap.keySet();


        int sum = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();

            int l = 0;
            while (l < line.length()) {
                if (Character.isDigit(line.charAt(l))) {
                    break;
                }
                l++;
            }

            int min = Integer.MAX_VALUE;
            int first = 0;
            for (String cur : digitSet) {
                int i = line.indexOf(cur);
                if (i != -1) {
                    if (i < min) {
                        min = i;
                        first = digitMap.get(cur);
                    }
                }
            }

            if (l != line.length() && l < min) {
                first = Integer.parseInt("" + line.charAt(l));
            }


            int r = line.length() - 1;
            while (r > 0) {
                if (Character.isDigit(line.charAt(r))) {
                    break;
                }
                r--;
            }

            int max = Integer.MIN_VALUE;
            int last = 0;
            for (String cur : digitSet) {
                int i = line.lastIndexOf(cur);
                if (i != -1) {
                    if (i > max) {
                        max = i;
                        last = digitMap.get(cur);
                    }
//                    break;
                }
            }

            if (r > -1 && r > max) {
                last = Integer.parseInt("" + line.charAt(r));
            }

            int num = Integer.parseInt("" + first + last);
            System.out.println(line + " - " + first + "-" + last + "-" + num);
            sum += num;
        }
        System.out.println("SUM => " + sum);

    }
}
