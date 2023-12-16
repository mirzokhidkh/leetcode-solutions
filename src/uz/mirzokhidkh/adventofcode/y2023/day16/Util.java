package uz.mirzokhidkh.adventofcode.y2023.day16;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Util {

    public static final String RIGHT = "RIGHT";
    public static final String LEFT = "LEFT";
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";


    public static int bfs(char[][] grid, Queue<Tile> queue, boolean[][] visited) {

//        String from;
        int count = 0;
        Set<String> set = new HashSet<>();
//        System.out.println(i+'-'+j);
//        visited[i][j] = true;


        while (!queue.isEmpty()) {


            int size = queue.size();

            for (int k = 0; k < size; k++) {
                Tile tile = queue.poll();
                int i = tile.i;
                int j = tile.j;
                String from = tile.from;


                if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
                    continue;
                }

//                System.out.println(i + "-" + j);

//                boolean isRepeat = false;
//                for (String s : set) {
//                    if (s.startsWith(i + "-" + j)) {
//                        isRepeat = true;
//                        break;
//                    }
//                }

//                if (!isRepeat) {
//                    ++count;
//                }

//                if (!visited[i][i]) {
//                    ++count;
//                }


                String key = i + "-" + j + "-" + from;
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
