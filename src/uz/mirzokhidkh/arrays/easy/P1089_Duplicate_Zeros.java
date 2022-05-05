package uz.mirzokhidkh.arrays.easy;

public class P1089_Duplicate_Zeros {


    /**
    APPROACH-1
     **/
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }

                if (i + 1 < arr.length) {
                    arr[i + 1] = 0;
                    i++;
                }

            }

        }
    }


}
