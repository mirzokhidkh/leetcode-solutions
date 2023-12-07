package uz.mirzokhidkh.adventofcode.y2023.day03;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day03/input"));
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day03/test"));
        int i = 1;

        // 1-> hamma line larni tartib bilan Map ga qo'shib chiqamiz
        // (key,val)-> (tartib son, line)
        // 2-> mapni loopda aylanib sonlarni aniqlab olamiz
        // 3-> shu aniqlagan son bo'yicha simvolga qo'shni bo'lishini tekshirib olamiz

        Map<Integer, String> lineMap = new HashMap<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            lineMap.put(i++, line);
        }

        int sum = 0;

        for (Integer j : lineMap.keySet()) {
            String line = lineMap.get(j);
            StringBuilder num = new StringBuilder();
            int start = -1, end = -1;
            System.out.println(j + "-> " + line);
            for (int k = 0; k < line.length(); k++) {
                char c = line.charAt(k);
                if (Character.isDigit(c)) {
                    num.append(c);
                    if (start == -1) {
                        start = k;
                    }
                } else if (num.toString().length() > 0) {
                    end = k - 1;

                    if (start > 0 && isSymbol(String.valueOf(line.charAt(start - 1)))) {
                        sum += Integer.parseInt(num.toString());
                        start = -1;
                        System.out.println(j + "-" + num);

                    } else if (end < line.length() - 1 && isSymbol(String.valueOf(line.charAt(end + 1)))) {
                        sum += Integer.parseInt(num.toString());
                        start = -1;
                        System.out.println(j + "-" + num);

                    } else {
                        if (j > 1) {
                            String prevLine = lineMap.get(j - 1);
                            prevLine = prevLine.substring(start > 0 ? start - 1 : start, end + 2 < line.length() ? end + 2 : end + 1);
                            for (int pi = 0; pi < prevLine.length(); pi++) {
                                if (isSymbol(String.valueOf(prevLine.charAt(pi)))) {
                                    sum += Integer.parseInt(num.toString());
                                    start = -1;
                                    System.out.println(j + "-" + num);
                                    break;
                                }
                            }
                        }

                        if (start != -1 && lineMap.containsKey(j + 1)) {
                            String nextLine = lineMap.get(j + 1);
                            nextLine = nextLine.substring(start > 0 ? start - 1 : start, end + 2 < line.length() ? end + 2 : end + 1);
                            for (int pi = 0; pi < nextLine.length(); pi++) {
                                if (isSymbol(String.valueOf(nextLine.charAt(pi)))) {
                                    sum += Integer.parseInt(num.toString());
                                    start = -1;
                                    System.out.println(j + "-" + num);
                                    break;
                                }
                            }
                        }

                    }

                    num = new StringBuilder();

                }
            }
        }

        System.out.println("SUM => " + sum);
    }

    public static boolean isSymbol(String s) {
        return !s.equals(".") && s.matches("[^A-Za-z0-9 ]");
    }


}
