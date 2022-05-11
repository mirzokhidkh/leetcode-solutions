package uz.mirzokhidkh.arrays.easy;

import java.util.Arrays;

public class P1346_Check_If_N_and_Its_Double_Exist {


    /**
     * 1-Approach. Brute-Force approach
     */
    public boolean checkIfExist(int[] arr) {

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++ ){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }

        return false;
    }





}
