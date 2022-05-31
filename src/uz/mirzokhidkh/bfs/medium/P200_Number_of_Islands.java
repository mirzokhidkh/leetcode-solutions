package uz.mirzokhidkh.bfs.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P200_Number_of_Islands {

    private static int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int numIslands(char[][] grid) {
        int count = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }


    public void bfs(int i, int j, char[][] grid, boolean[][] visited) {

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(i, j));
        visited[i][j] = true;
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {
                List<Integer> pair = queue.poll();
                assert pair != null;
                int rowIndex = pair.get(0);
                int colIndex = pair.get(1);

                for (int[] dir : directions) {
                    if (isValid(rowIndex + dir[0], colIndex + dir[1], grid, visited)) {
                        queue.offer(Arrays.asList(rowIndex + dir[0], colIndex + dir[1]));
                        visited[rowIndex + dir[0]][colIndex + dir[1]] = true;
                    }
                }
            }

        }


    }

    public boolean isValid(int i, int j, char[][] arr, boolean[][] visited) {
        return i > -1 && i < arr.length && j > -1 && j < arr[0].length && arr[i][j] == '1' && !visited[i][j];
    }
}
