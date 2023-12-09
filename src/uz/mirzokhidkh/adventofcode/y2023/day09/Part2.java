package uz.mirzokhidkh.adventofcode.y2023.day09;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static uz.mirzokhidkh.adventofcode.y2023.day09.Util.*;

public class Part2 {
    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/9/input
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day09/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day09/test"));


        //1-> har bir line ni long massiv qilib o'zlashtiramiz
        //2-> massivni farqlar sequence tuzib chiqamiz
        //3-> farqlar sequence ni hamma qiymatlari nol bo'lguncha Stackga qo'shib chiqamiz
        //4-> hammasi nol bo'lganda Stack emtpy bo'lguncha
        // historyni keyingi qiymatini topish uchun Stackdan  oldingi sequencelarni oxirgi qiymati
        // ketma-ket topib chiqamiz

        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        while (sc.hasNext()) {
            //1
            int[] curSeq = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//            System.out.println(Arrays.toString(cueSeq));
            while (!areAllZero(curSeq)) {
                //2
                int[] nextSeq = createNextSequence(curSeq);

                //3
                stack.push(curSeq[0]);

//                System.out.println("nextSeq = " + Arrays.toString(nextSeq));
                curSeq = nextSeq;
            }
//            System.out.println("stack = " + stack);
            //4
            sum += extraPolatePrevVal(stack);
        }


        System.out.println(" the sum of these extrapolated values = " + sum);


    }


}
