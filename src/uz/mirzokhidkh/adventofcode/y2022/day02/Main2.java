package uz.mirzokhidkh.adventofcode.y2022.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("src/uz/mirzokhidkh/adventofcode/day02/input.txt"));

        // Part 1:
        System.out.println(lines.stream().mapToInt(s -> {
            int p1 = s.charAt(0)-'A';
            int p2 = s.charAt(2)-'X';
            int result = (p2-p1+4) % 3;
            return (p2+1) + result*3;
        }).sum());

        // Part 2:
        System.out.println(lines.stream().mapToInt(s -> {
            int p1 = s.charAt(0)-'A';
            int p2 = (p1+(s.charAt(2)-'X')+2) % 3;
            int result = (p2-p1+4) % 3;
            return (p2+1) + result*3;
        }).sum());
    }
}
