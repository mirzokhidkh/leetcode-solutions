package uz.mirzokhidkh.sorting.easy;

public class P1051_Height_Checker {
    public int heightChecker(int[] heights) {

        int n = heights.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = heights[i];
        }

        bubbleSort(arr);

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != heights[i]) {
                k++;
            }
        }

        return k;
    }


    private void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
