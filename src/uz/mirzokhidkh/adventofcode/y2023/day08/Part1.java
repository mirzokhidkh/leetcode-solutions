package uz.mirzokhidkh.adventofcode.y2023.day08;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day08/input"));
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day08/test"));

        String instructions = sc.nextLine();
        sc.nextLine();
        int i = 1;
        Map<String, String> lineMap = new HashMap<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String key = line.substring(0, 3);
            String val = line.substring(line.indexOf("=") + 2);
            lineMap.put(key, val);
//            System.out.println(i+"-"+line);
//            System.out.println(key+"-"+val);
            i++;
        }
        String node = "AAA";

        i = 0;
        int c = 1;
        while (!Objects.equals(node, "ZZZ")) {
            char inst = instructions.charAt(i);
            String val = lineMap.get(node);

            if (inst == 'L') {
                node = val.substring(1, 4);
            } else {
                node = val.substring(6, 9);
            }

            if (i == instructions.length() - 1) {
                i = 0;
            } else {
                i++;
            }
            c++;
        }

        System.out.println("Steps count = " + (c - 1));


    }


}
