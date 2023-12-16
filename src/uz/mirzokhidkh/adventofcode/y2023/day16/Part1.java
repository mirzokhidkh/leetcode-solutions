package uz.mirzokhidkh.adventofcode.y2023.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Part1 {
    private static final String RIGHT = "RIGHT";
    private static final String LEFT = "LEFT";
    private static final String UP = "UP";
    private static final String DOWN = "DOWN";

    public static void main(String[] args) throws IOException {


//        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/test"))
        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/input"))
                .stream().map(String::toCharArray).toArray(char[][]::new);

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int dfs = bfs(grid, 0, 0, visited);
        System.out.println(dfs);

//        System.out.println(Arrays.deepToString(grid));

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean isVisited = visited[i][j];
                if (isVisited) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }

    }


    private static int bfs(char[][] grid, int i, int j, boolean[][] visited) {

        String from;
        int count = 0;
        Set<String> set = new HashSet<>();
//        System.out.println(i+'-'+j);
//        visited[i][j] = true;

        Queue<Tile> queue = new LinkedList<>();
        queue.offer(new Tile(i, j, LEFT));

        while (!queue.isEmpty()) {


            int size = queue.size();

            for (int k = 0; k < size; k++) {
                Tile tile = queue.poll();
                i = tile.i;
                j = tile.j;
                from = tile.from;


                if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
                    continue;
                }

//                System.out.println(i + "-" + j);

                boolean isRepeat = false;
                for (String s : set) {
                    if (s.startsWith(i + "-" + j)) {
                        isRepeat = true;
                        break;
                    }
                }

                if (!isRepeat) {
                    count++;
                }

                String key = i + "-" + j + from;
                if (set.contains(key)) {
                    continue;
                }
                set.add(key);

                char c = grid[i][j];
                visited[i][j] = true;


                if (c == '/') {
                    switch (from) {
                        case RIGHT -> queue.offer(new Tile(i + 1, j, UP));
                        case LEFT -> queue.offer(new Tile(i - 1, j, DOWN));
                        case UP -> queue.offer(new Tile(i, j - 1, RIGHT));
                        case DOWN -> queue.offer(new Tile(i, j + 1, LEFT));
                    }
                } else if (c == '\\') {
                    switch (from) {
                        case RIGHT -> queue.offer(new Tile(i - 1, j, DOWN));
                        case LEFT -> queue.offer(new Tile(i + 1, j, UP));
                        case UP -> queue.offer(new Tile(i, j + 1, LEFT));
                        case DOWN -> queue.offer(new Tile(i, j - 1, RIGHT));
                    }
                } else if (c == '|') {
                    switch (from) {
                        case RIGHT, LEFT -> {
                            queue.offer(new Tile(i - 1, j, DOWN));
                            queue.offer(new Tile(i + 1, j, UP));
                        }
                        case UP -> queue.offer(new Tile(i + 1, j, UP));
                        case DOWN -> queue.offer(new Tile(i - 1, j, DOWN));
                    }
                } else if (c == '-') {
                    switch (from) {
                        case UP, DOWN -> {
                            queue.offer(new Tile(i, j - 1, RIGHT));
                            queue.offer(new Tile(i, j + 1, LEFT));
                        }
                        case RIGHT -> queue.offer(new Tile(i, j - 1, RIGHT));
                        case LEFT -> queue.offer(new Tile(i, j + 1, LEFT));
                    }
                } else {
                    switch (from) {
                        case RIGHT -> queue.offer(new Tile(i, j - 1, RIGHT));
                        case LEFT -> queue.offer(new Tile(i, j + 1, LEFT));
                        case UP -> queue.offer(new Tile(i + 1, j, UP));
                        case DOWN -> queue.offer(new Tile(i - 1, j, DOWN));
                    }
                }
            }

        }
        return count;
    }

}


