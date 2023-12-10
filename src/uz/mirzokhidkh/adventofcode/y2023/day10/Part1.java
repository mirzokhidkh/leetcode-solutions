package uz.mirzokhidkh.adventofcode.y2023.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Part1 {
    public static final String NORTH = "NORTH";
    public static final String SOUTH = "SOUTH";
    public static final String WEST = "WEST";
    public static final String EAST = "EAST";

    public static final char NORTH_SOUTH = '|';
    public static final char WEST_EAST = '-';
    public static final char NORTH_EAST = 'L';
    public static final char NORTH_WEST = 'J';
    public static final char SOUTH_WEST = '7';
    public static final char SOUTH_EAST = 'F';

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day10/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day10/test"));

//        char[][] pipes = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day10/test"))
        char[][] pipes = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day10/input"))
                .stream()
                .map(String::toCharArray)
                .toArray(char[][]::new);

//        Arrays.stream(pipes).forEach(System.out::println);


        List<Character> north = new ArrayList<>(Arrays.asList('|', 'L', 'J'));
        List<Character> south = new ArrayList<>(Arrays.asList('|', '7', 'F'));
        List<Character> west = new ArrayList<>(Arrays.asList('-', 'L', 'F'));
        List<Character> east = new ArrayList<>(Arrays.asList('|', 'J', '7'));

        int step = 0;
        for (int i = 0; i < pipes.length; i++) {
            for (int j = 0; j < pipes[0].length; j++) {
                char ch = pipes[i][j];
                if (ch == 'S') {
                    if (i > 0 && south.contains(pipes[i - 1][j])) {
                        step = dfs(pipes, i - 1, j, SOUTH, 1) / 2;
                    } else if (i < pipes.length - 1 && north.contains(pipes[i + 1][j])) {
                        step = dfs(pipes, i + 1, j, NORTH, 1) / 2;
                    } else if (j > 0 && east.contains(pipes[i][j - 1])) {
                        step = dfs(pipes, i, j - 1, EAST, 1) / 2;
                    } else if (j < pipes.length - 1 && west.contains(pipes[i][j + 1])) {
                        step = dfs(pipes, i, j + 1, WEST, 1) / 2;
                    }
                }
            }
        }

        System.out.println(step);

    }


    private static int dfs(char[][] pipes, int i, int j, String from, int c) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j, c});  // {row, column, steps}

        while (!queue.isEmpty()) {


            int size = queue.size();

            if (pipes[i][j] == 'S') {
//                    break;
                return c;
            }
            int[] current = queue.poll();
            i = current[0];
            j = current[1];
            c = current[2];
            System.out.printf("pipes[%s][%s] = %s\n", i, j, pipes[i][j]);

            String to = getNextDir(pipes[i][j], from);
            if (to == null) {
                break;
            }
            int[] points = getNextPoints(to);
//            if (points.length == 0) {
//                break;
//            }
            queue.offer(new int[]{i + points[0], j + points[1], c + 1});  // {row, column, steps}
            from = reverseDir(to);
        }

        return c;
//        return dfs(pipes, i + points[0], j + points[1], reverseDir(to), c + 1);
    }


    private static String getNextDir(char c, String from) {
        switch (c) {
            case NORTH_SOUTH -> {
                if (Objects.equals(from, NORTH)) {
                    return SOUTH;
                }
                return NORTH;
            }
            case WEST_EAST -> {
                if (Objects.equals(from, WEST)) {
                    return EAST;
                }
                return WEST;
            }
            case NORTH_EAST -> {
                if (Objects.equals(from, NORTH)) {
                    return EAST;
                }
                return NORTH;
            }
            case NORTH_WEST -> {
                if (Objects.equals(from, NORTH)) {
                    return WEST;
                }
                return NORTH;
            }
            case SOUTH_WEST -> {
                if (Objects.equals(from, SOUTH)) {
                    return WEST;
                }
                return SOUTH;
            }
            case SOUTH_EAST -> {
                if (Objects.equals(from, SOUTH)) {
                    return EAST;
                }
                return SOUTH;
            }
        }
        return null;
    }


    private static int[] getNextPoints(String to) {
        switch (to) {
            case NORTH -> {
                return new int[]{-1, 0};
            }
            case SOUTH -> {
                return new int[]{1, 0};
            }
            case WEST -> {
                return new int[]{0, -1};
            }
            case EAST -> {
                return new int[]{0, 1};
            }
            default -> {
                return new int[]{};
            }
        }

    }

    private static String reverseDir(String to) {
        switch (to) {
            case NORTH -> {
                return SOUTH;
            }
            case SOUTH -> {
                return NORTH;
            }
            case WEST -> {
                return EAST;
            }
            case EAST -> {
                return WEST;
            }
        }
        return null;
    }

}
