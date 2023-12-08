package uz.mirzokhidkh.adventofcode.y2023.day08;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Part2 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/1/input
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day08/input"));
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day08/test"));

        String instructions = sc.nextLine();
        sc.nextLine();
        int i = 0;
        Map<String, String> lineMap = new HashMap<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String key = line.substring(0, 3);
            String val = line.substring(line.indexOf("=") + 2);
            lineMap.put(key, val);
//            System.out.println(i+"-"+line);
//            System.out.println(key+"-"+val);
            if (key.endsWith("A")) {
                i++;
            }
        }


        String[] nodes = new String[i];
        i = 0;
        for (String key : lineMap.keySet()) {
            if (key.endsWith("A")) {
                nodes[i++] = key;
            }
        }

//        System.out.println(Arrays.toString(nodes));
//        long count = Arrays.stream(nodes).filter(s -> s.endsWith("A")).count();
//        System.out.println(count);

        i = 0;
        int c = 1;

        while (true) {
            char inst = instructions.charAt(i);
            int k = 0;
            for (String node : nodes) {

                String val = lineMap.get(node);
                if (inst == 'L') {
                    node = val.substring(1, 4);
                } else {
                    node = val.substring(6, 9);
                }
//                nodes.remove(node);
//                nodes.add(node);
                nodes[k++] = node;
            }

            long count = Arrays.stream(nodes).filter(s -> s.endsWith("Z")).count();
//            long count = 0;
//            for (String node : nodes) {
//                if (node.endsWith("Z")) {
//                    count++;
//                }
//            }
            if (count == nodes.length) {
                break;
            }

            c++;

            if (i == instructions.length() - 1) {
                i = 0;
            } else {
                i++;
                System.out.println(i);
            }
        }

        System.out.println("Steps count = " + c);

    }


}
