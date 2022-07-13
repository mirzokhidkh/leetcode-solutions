package uz.mirzokhidkh.bfs.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P733_Flood_Fill {

    int[][] dirs = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] != color)
            bfs(image, sr, sc, image[sr][sc], color);

        return image;
    }


    public void bfs(int[][] arr, int i, int j, int startColor, int newColor) {

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(i, j));
        arr[i][j] = newColor;

        while (!queue.isEmpty()) {

            List<Integer> curPixel = queue.poll();
            assert curPixel != null;
            int r = curPixel.get(0);
            int c = curPixel.get(1);

            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (isValidNeighboringPixel(arr, nr, nc, startColor)) {
                    queue.offer(Arrays.asList(nr, nc));
                    arr[nr][nc] = newColor;
                }
            }
        }
    }


    public boolean isValidNeighboringPixel(int[][] arr, int i, int j, int target) {
        return (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length && arr[i][j] == target);
    }
}
