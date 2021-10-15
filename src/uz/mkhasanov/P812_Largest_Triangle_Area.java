package uz.mkhasanov;

import static java.lang.Math.*;

public class P812_Largest_Triangle_Area {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));
        System.out.println(largestTriangleArea(new int[][]{{4, 6}, {6, 5}, {3, 1}}));
    }


    public static double largestTriangleArea(int[][] points) {
        double max = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double a = sqrt(abs(pow(points[i][0], 2) - pow(points[i][1], 2)));
                double b = sqrt(abs(pow(points[j][0], 2) - pow(points[j][1], 2)));
                max = max(max, a * b / 2);
            }   
        }

        return max;
    }
}
