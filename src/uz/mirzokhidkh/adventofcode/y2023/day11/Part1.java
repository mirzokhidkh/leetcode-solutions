package uz.mirzokhidkh.adventofcode.y2023.day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Part1 {

    public static void main(String[] args) throws IOException {


//        char[][] pipes = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day10/test"))
        char[][] pipes = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day10/input"))
                .stream()
                .map(String::toCharArray)
                .toArray(char[][]::new);


    }

}
