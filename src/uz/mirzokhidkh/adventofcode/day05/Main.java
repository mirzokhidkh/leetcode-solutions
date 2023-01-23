package uz.mirzokhidkh.adventofcode.day05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day05/input.txt"));
//
//        int total1 = 0;
//
//        int total2 = 0;
//
//        while (sc.hasNext()) {
//            String strLine = sc.nextLine();
//
//
//
//        }
//
//        System.out.println(total1);
//        System.out.println(total2);



        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/day05/ms.txt"));

        FileWriter fileWriter = new FileWriter("output.txt");
        int i=0;

        while (sc.hasNext()) {
            String strLine = sc.nextLine();

            fileWriter.write(++i+" ===> "+strLine+"\n");
            fileWriter.flush();


        }
    }
}
