package uz.mirzokhidkh.tree.medium;

import java.text.ParseException;

public class P200_Number_of_Islands_DFS {

    public static void main(String[] args) throws ParseException {

        System.out.println(numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        }));//1

        System.out.println(numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }));//3


    }

    // APPROACH - DFS

    private static int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static int numIslands(char[][] grid) {
        int count = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int i, int j, char[][] grid, boolean[][] visited) {
        if (!isValidNeighbour(i, j, grid, visited))
            return;
        visited[i][j] = true;
        for (int[] dir : directions) {
            dfs(i + dir[0], j + dir[1], grid, visited);
        }
    }

    private static boolean isValidNeighbour(int i, int j, char[][] grid, boolean[][] visited) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] != '0' && !visited[i][j];
    }

}
