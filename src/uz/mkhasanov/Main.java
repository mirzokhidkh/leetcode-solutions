package uz.mkhasanov;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append(1);

        String s = "12345";
        System.out.println(reverse(0, 4,s));

    }


    public static String reverse(int start, int end, String s ){


        char[] chars = s.toCharArray();

        while(start<end){

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end]=temp;
            start++;
            end--;
        }


        return String.valueOf(chars);
    }
}