package uz.mirzokhidkh.adventofcode.y2023.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;

import static uz.mirzokhidkh.adventofcode.y2023.day16.Util.*;

public class Part2 {
    public static void main(String[] args) throws IOException {


        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/input"))
//        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/test"))
                .stream()
                .map(String::toCharArray)
                .toArray(char[][]::new);


        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                Queue<Tile> queue = new LinkedList<>();
                if (i == 0) {
                    boolean[][] visited = new boolean[grid.length][grid[0].length];
                    queue.offer(new Tile(i, j, UP));
                    int count = bfs(grid, queue, visited);
                    int k = getK(grid, visited);
                    max = Math.max(max, k);
                }

                if (i == grid.length-1) {
                    boolean[][] visited = new boolean[grid.length][grid[0].length];
                    queue.offer(new Tile(i, j, DOWN));
                    int count = bfs(grid, queue, visited);
                    int k = getK(grid, visited);
                    max = Math.max(max, k);
                }

                if (j == 0) {
                    boolean[][] visited = new boolean[grid.length][grid[0].length];
                    queue.offer(new Tile(i, j, LEFT));
                    int count = bfs(grid, queue, visited);
                    int k = getK(grid, visited);
                    max = Math.max(max, k);
                }

                if (j == grid.length-1) {
                    boolean[][] visited = new boolean[grid.length][grid[0].length];
                    queue.offer(new Tile(i, j, RIGHT));
                    int count = bfs(grid, queue, visited);
                    int k = getK(grid, visited);
                    max = Math.max(max, k);
                }


            }
        }


        System.out.println(max);


//        System.out.println(Arrays.deepToString(grid));


    }

    private static int getK(char[][] grid, boolean[][] visited) {
        int k = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean isVisited = visited[i][j];
                if (isVisited) {
//                                System.out.print("#");
                    k++;
                } else {
//                                System.out.print(".");
                }
            }

//                        System.out.println();

        }
        return k;
    }


}
