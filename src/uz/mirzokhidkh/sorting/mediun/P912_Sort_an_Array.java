package uz.mirzokhidkh.sorting.mediun;

public class P912_Sort_an_Array {

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapSort(nums, n, i);
        }


        for (int i = n - 1; i >=0; i--) {

            swap(nums, 0, i);

            maxHeapSort(nums, i, 0);
        }



        return nums;
    }

    public void maxHeapSort(int[] arr, int n,int i) {

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int largest = i;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {

            swap(arr, i, largest);

            maxHeapSort(arr, n, largest);

        }



    }

    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
