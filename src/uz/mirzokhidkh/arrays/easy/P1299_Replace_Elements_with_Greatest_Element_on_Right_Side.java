package uz.mirzokhidkh.arrays.easy;

public class P1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for(int i = arr.length-1; i >=0 ; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp,max);
        }


        return arr;
    }
}
