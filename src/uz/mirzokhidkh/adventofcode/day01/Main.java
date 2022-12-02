package uz.mirzokhidkh.adventofcode.day01;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\leetcode-solutions\\src\\uz\\mirzokhidkh\\adventofcode\\day01\\input.txt"));

        int max = 0;
        int val = 0;
        List<Integer> list = new ArrayList<>();


        while (sc.hasNext()) {
            String a = sc.nextLine();
            if (Objects.equals(a, "")) {
//                System.out.println("EMPTY");
                list.add(val);
                max = Math.max(val, max);
                val = 0;
            } else {
//                System.out.println(a);
                val += Integer.parseInt(a);
            }
        }

        System.out.println(max);

//        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).sum());


    }


}
