package uz.mkhasanov.arrays.medium;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class P119_Pascal_s_Triangle_II {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(getRow(3)); //[1,3,3,1]
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int len = res.size();
            for (int j =len-1; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
            res.add(1);
        }
        return res;
    }
}


