package uz.mirzokhidkh.adventofcode.y2023.day03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/test"));
        int sum = 0;


        //red, green. blue
        while (sc.hasNext()) {
            String line = sc.nextLine();
            line = line.substring(line.indexOf(":") + 1);
            String[] sets = line.split(";");
//            System.out.println(Arrays.toString(sets));




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
