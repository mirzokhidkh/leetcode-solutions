package uz.mirzokhidkh.adventofcode.day03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day03/input.txt"));

        int sum1 = 0;


        int sum2 = 0;
        int k = 1;
        String firstGr = null;
        String secondGr = null;
        String thirdGr = null;

        while (sc.hasNext()) {
            String str = sc.nextLine();

            String first = str.substring(0, str.length() / 2);
            String second = str.substring(str.length() / 2);

            for (char c : first.toCharArray()) {

                if (second.contains(String.valueOf(c))) {
                    int pos = Character.isLowerCase(c) ? (c - 'a' + 1) : (c - 'A' + 27);

//                    System.out.println(c + " : " + (pos) + "-position");
                    sum1 += pos;
                    break;
                }
            }

            if (k % 3 == 1) {
                firstGr = str;
                k++;
            } else if (k % 3 == 2) {
                secondGr = str;
                k++;
            } else if (k % 3 == 0) {
                thirdGr = str;

//                System.out.println(firstGr);
//                System.out.println(secondGr);
//                System.out.println(thirdGr);

                for (int j = 0; j < firstGr.length(); j++) {
                    char firstChar = firstGr.charAt(j);
                    if (secondGr.contains(String.valueOf(firstChar)) && thirdGr.contains(String.valueOf(firstChar)))
                    {

                        int pos = Character.isLowerCase(firstChar) ? (firstChar - 'a' + 1) : (firstChar - 'A' + 27);
                        System.out.println(firstChar + " : " + (pos) + "-position");


                        sum2 += pos;
                        break;
                    }
                }

//                firstGr = null;
//                secondGr = null;
//                thirdGr = null;
                k = 1;
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }


}
