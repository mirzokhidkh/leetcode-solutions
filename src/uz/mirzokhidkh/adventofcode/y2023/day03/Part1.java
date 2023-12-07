package uz.mirzokhidkh.adventofcode.y2023.day03;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day03/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day03/test"));
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
//        i = 0;

        int sum = 0;

        for (Integer lineNumber : lineMap.keySet()) {
            String line = lineMap.get(lineNumber);
            StringBuilder num = new StringBuilder();
            int start = -1, end;
            System.out.println(lineNumber + "-> " + line);
            for (i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isDigit(c)) {
                    num.append(c);
                    if (start == -1) {
                        start = i;
                    }
                } else if (num.toString().length() > 0) {
                    end = i - 1;
                    if (start > 0) {
                        char cleft = line.charAt(start - 1);
                        if (isSymbol(cleft)) {
                            sum += Integer.parseInt(num.toString());
//                        start = -1;
                            System.out.println(lineNumber + "-" + num + "_left_" + cleft);
                            break;
                        }

                    }

                    if (end < line.length() - 1) {
                        char cRight = line.charAt(end + 1);
                        if (isSymbol(cRight)) {

                            sum += Integer.parseInt(num.toString());
//                        start = -1;
                            System.out.println(lineNumber + "-" + num + "_right_" + cRight);
                            break;
                        }
                    }

                    if (lineNumber > 1) {
                        String prevLine = lineMap.get(lineNumber - 1);
                        prevLine = prevLine.substring(start > 0 ? start - 1 : start, end + 2 < line.length() ? end + 2 : end + 1);
                        for (int pi = 0; pi < prevLine.length(); pi++) {
                            char prevChar = prevLine.charAt(pi);
                            if (isSymbol(prevChar)) {
                                sum += Integer.parseInt(num.toString());
//                                    start = -1;
                                System.out.println(lineNumber + "-" + num + "_up_" + prevChar);
                                break;
                            }
                        }
                    }

                    if (start != -1 && lineMap.containsKey(lineNumber + 1)) {
                        String nextLine = lineMap.get(lineNumber + 1);
                        nextLine = nextLine.substring(start > 0 ? start - 1 : start, end + 2 < line.length() ? end + 2 : end + 1);
                        for (int pi = 0; pi < nextLine.length(); pi++) {
                            char nextChar = nextLine.charAt(pi);
                            if (isSymbol(nextChar)) {
                                sum += Integer.parseInt(num.toString());
//                                    start = -1;
                                System.out.println(lineNumber + "-" + num + "_down_" + nextChar);
                                break;
                            }
                        }
                    }


                    start = -1;
                    num = new StringBuilder();

                }
            }
        }

        System.out.println("SUM => " + sum);
    }

    public static boolean isSymbol(Character symbol) {
        String s = String.valueOf(symbol);
//        return !s.equals(".") && s.matches("[^0-9]");
        return !s.equals(".");
    }


}
