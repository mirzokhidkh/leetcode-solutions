package uz.mkhasanov;

import java.util.Arrays;

import static java.lang.Math.*;

public class P812_Largest_Triangle_Area {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));
        System.out.println(largestTriangleArea(new int[][]{{4, 6}, {6, 5}, {3, 1}}));

//        System.out.println(Arrays.deepToString(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}));

    }


    public static double largestTriangleArea(int[][] points) {
        double max = 0;

        for (int i = 0; i < points.length-2; i++) {

            for (int j = i + 1; j < points.length-1; j++) {
                double x1 = points[i][0] - points[j][0];
                double y1 = points[i][1] - points[j][1];
                double a = sqrt(pow(x1,2) + pow(y1,2));
                for (int k = j + 1; k < points.length; k++) {
                    double x2 = points[i][0] - points[k][0];
                    double y2 = points[i][1] - points[k][1];
                    double b = sqrt(pow(x2,2) + pow(y2,2));
                    double x3 = points[j][0] - points[k][0];
                    double y3 = points[j][1] - points[k][1];
                    double c = sqrt(pow(x3,2) + pow(y3,2));
                    double p = (a + b + c) / 2;
                    double S = sqrt(p*(p - a) * (p - b) * (p - c));
                    max = max(max,S);
                }
            }
        }

        return max;
    }
}
