package uz.mkhasanov.two_pointers.easy;

public class P344_Reverse_String {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }

    public void swap(char[] s,int i, int j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
