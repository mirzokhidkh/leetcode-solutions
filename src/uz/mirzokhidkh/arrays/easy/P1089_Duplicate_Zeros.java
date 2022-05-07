package uz.mirzokhidkh.arrays.easy;

public class P1089_Duplicate_Zeros {


    /**
    APPROACH-1
     **/
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j ] = arr[j-1];
                }

            }

        }
    }


}
