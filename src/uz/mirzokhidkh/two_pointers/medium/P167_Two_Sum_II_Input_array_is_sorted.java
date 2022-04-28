package uz.mirzokhidkh.two_pointers.medium;

public class P167_Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) throws InterruptedException {
        int[] a = new int[]{2, 7, 11, 15};
        int[] b = new int[]{12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180,
                199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375,
                384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585,
                587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863,
                863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997};
        int[] c = new int[]{-1, 0};
        int[] d = new int[]{2, 3, 4};
//        System.out.println(Arrays.toString(twoSum(a, 9)));
//        System.out.println(Arrays.toString(twoSum(b, 542))); //[24,32]
//        System.out.println(Arrays.toString(twoSum(c, -1)));
//        System.out.println(Arrays.toString(twoSum(d, 6)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int ind = binarySearch(numbers, 0, numbers.length - 1, target)+1;
        int l = 0, r = ind - 1;


        while (l<r) {
            if(numbers[l]+numbers[r]==target)
                return new int[]{l+1,r+1};

            if(numbers[l]+numbers[r]<target)
                l++;
            else
                r--;
        }
        return new int[]{};

    }

    public int binarySearch(int[] arr, int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (mid < arr.length - 1) {
                if (arr[mid+1]!=0 && arr[mid] <= x && arr[mid + 1] > x) {
                    return mid+1;
                }
            }

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return arr.length - 1;
    }


}
