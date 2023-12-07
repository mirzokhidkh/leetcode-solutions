package uz.mirzokhidkh.adventofcode.y2023.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/test"));
        int sum = 0;
        int i = 1;
        String RED = "red";
        String GREEN = "green";
        String BLUE = "blue";

        //red, green. blue
        while (sc.hasNext()) {
            String line = sc.nextLine();
            line = line.substring(line.indexOf(":") + 1);
            String[] sets = line.split(";");
//            System.out.println(Arrays.toString(sets));

            int maxR = 0;
            int maxG = 0;
            int maxB = 0;

            //12,13,14
            for (String set : sets) {
                set = set.trim();
                System.out.println("SubSet - " + set);

                String[] cubesByColor = set.split(",");

                for (String cubeWithNum : cubesByColor) {
                    maxR = getMaxNumByColor(RED, maxR, cubeWithNum);
                    maxG = getMaxNumByColor(GREEN, maxG, cubeWithNum);
                    maxB = getMaxNumByColor(BLUE, maxB, cubeWithNum);
                }
            }


            sum += maxR * maxG * maxB;
            i++;
        }

        System.out.println("SUM => " + sum);
    }

    private static int getMaxNumByColor(String color, int max, String cubeWithNum) {
        if (cubeWithNum.contains(color)) {
            cubeWithNum = cubeWithNum.trim();
            int num = Integer.parseInt(cubeWithNum.substring(0, cubeWithNum.indexOf(color) - 1));
            max = Math.max(max, num);
        }
        return max;
    }
}
