package uz.mkhasanov;

public class P344_Reverse_String {
    public static void main(String[] args) {
        char[] s =  new char[]{'h','e','l','l','o'};
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            swap(i,s.length-i-1,s);
        }
    }

    public static void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
}
