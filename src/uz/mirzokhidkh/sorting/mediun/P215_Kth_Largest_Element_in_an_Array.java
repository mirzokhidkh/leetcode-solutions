package uz.mirzokhidkh.sorting.mediun;

public class P215_Kth_Largest_Element_in_an_Array {

    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;

        for(int i=n/2-1;i>=0;i--){
            maxHeapify(nums,n,i);
        }

        for(int i=n-1;i>=0;i--){
            swap(nums,0,i);

            maxHeapify(nums,i,0);
        }


        return nums[nums.length-k];
    }

    public void maxHeapify(int[] arr, int heapSize, int ind){

        int left = 2*ind+1;
        int right = 2*ind+2;

        int largest = ind;

        if(left<heapSize && arr[left]>arr[largest] ){
            largest=left;
        }

        if(right<heapSize && arr[right]>arr[largest] ){
            largest=right;
        }

        if(largest!=ind){
            swap(arr,ind,largest);
            maxHeapify(arr,heapSize,largest);
        }

    }


    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
