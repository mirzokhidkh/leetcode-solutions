package uz.mirzokhidkh.adventofcode.y2022.day02;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day02/input.txt"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day02/input2.txt"));

        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("A", 1);
            put("B", 2);
            put("C", 3);

            put("X", 1);
            put("Y", 2);
            put("Z", 3);
        }};

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>() {{
            put("X", 0);
            put("Y", 3);
            put("Z", 6);
        }};

        HashMap<String, String> mapForWon = new HashMap<String, String>() {{
            put("A", "Y");
            put("B", "Z");
            put("C", "X");
        }};

        HashMap<String, String> mapForLost = new HashMap<String, String>() {{
            put("A", "Z");
            put("B", "X");
            put("C", "Y");
        }};


        int totalScore = 0;
        int totalScore2 = 0;

        while (sc.hasNext()) {
            String first = sc.next();
            String second = sc.next();

            totalScore += map.get(second);

            if (map.get(first) - map.get(second) == -1 || map.get(first) - map.get(second) == 2) {
                totalScore += 6;
            } else if (map.get(first) - map.get(second) == 0) {
                totalScore += 3;
            }


            ///PART-2
            ///X means you need to lose, Y means you need to end the round in a draw,
            // and Z means you need to win.

            totalScore2 += hashMap.get(second);

            switch (second) {
                case "X":
                    totalScore2 += map.get(mapForLost.get(first));
                    break;
                case "Y":
                    totalScore2 += map.get(first);
                    break;
                case "Z":
                    totalScore2 += map.get(mapForWon.get(first));
                    break;
            }


        }


        System.out.println(totalScore);//11841
        System.out.println(totalScore2);//13022

    }


}
