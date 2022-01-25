package uz.mkhasanov.number.easy;

import java.text.ParseException;

public class P2139_Minimum_Moves_to_Reach_Target_Score {

    public static void main(String[] args) throws ParseException {
        System.out.println(minMoves(5, 0));//4
        System.out.println(minMoves(19, 2));//7
        System.out.println(minMoves(10, 4));//4
    }

    public static int minMoves(int target, int maxDoubles) {
        return Math.min(minMoves(target, target - 1, maxDoubles, 1),
                minMoves(target, target - maxDoubles, maxDoubles, 1));
    }

    public static int minMoves(int l, int target, int maxDoubles, int count) {
        if (target == 1) return count;

        else if (count >= l - 1) {
            return minMoves(l, target - 1, maxDoubles, ++count);
        }

        return Math.min(minMoves(l, target - 1, maxDoubles, ++count),
                minMoves(l, target - maxDoubles, maxDoubles, ++count));
    }

}
