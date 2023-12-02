package uz.mirzokhidkh.adventofcode.y2023.day02;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Part1 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day02/test"));
        int sum = 0;
        int i = 1;

        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("red", 12);
        colorMap.put("green", 13);
        colorMap.put("blue", 14);

        //red, green. blue
        while (sc.hasNext()) {
            String line = sc.nextLine();
            line = line.substring(line.indexOf(":") + 1);
            String[] sets = line.split(";");
//            System.out.println(Arrays.toString(sets));
            boolean possible = true;

            //12,13,14
            for (String set : sets) {
                set = set.trim();
//                System.out.println("SubSet - " + set);

                String[] cubesByColor = set.split(",");

                for (String cube : cubesByColor) {
                    if (checkNumberOfCubesEachColor(i, cube, colorMap)) {
                        possible = false;
                        break;
                    }
                }
            }
            if (possible) {
                sum += i;
            }
            i++;
        }

        System.out.println("SUM => " + sum);
    }

    private static boolean checkNumberOfCubesEachColor(int i, String cubeWithNum, Map<String, Integer> colorMap) {

        Set<String> colors = colorMap.keySet();
        for (String color : colors) {
            if (cubeWithNum.contains(color)) {
                cubeWithNum = cubeWithNum.trim();
                int num = Integer.parseInt(cubeWithNum.substring(0, cubeWithNum.indexOf(color) - 1));
                System.out.println(i + "-" + color + "-" + num);
                if (num > colorMap.get(color)) {
                    return true;
                }
            }
        }
        return false;
    }
}
