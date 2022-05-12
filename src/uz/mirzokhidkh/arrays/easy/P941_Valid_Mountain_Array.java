package uz.mirzokhidkh.arrays.easy;

public class P941_Valid_Mountain_Array {

    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;
        int i = 0;

        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == arr.length - 1 || i == 0) return false;

        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;

    }
}
