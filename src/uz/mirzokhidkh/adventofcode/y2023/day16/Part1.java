package uz.mirzokhidkh.adventofcode.y2023.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import static uz.mirzokhidkh.adventofcode.y2023.day16.Util.LEFT;
import static uz.mirzokhidkh.adventofcode.y2023.day16.Util.bfs;


public class Part1 {
    public static void main(String[] args) throws IOException {


//        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/test"))
        char[][] grid = Files.readAllLines(Paths.get("src/uz/mirzokhidkh/adventofcode/y2023/day16/input")).stream().map(String::toCharArray).toArray(char[][]::new);

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        Queue<Tile> queue = new LinkedList<>();
        queue.offer(new Tile(0, 0, LEFT));
        int count = bfs(grid, queue, visited);

//        System.out.println(Arrays.deepToString(grid));

        int k = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean isVisited = visited[i][j];
                if (isVisited) {
                    System.out.print("#");
                    k++;
                } else {
                    System.out.print(".");
                }
            }

            System.out.println();

        }

        System.out.println(count);
        System.out.println(k);

    }




}


