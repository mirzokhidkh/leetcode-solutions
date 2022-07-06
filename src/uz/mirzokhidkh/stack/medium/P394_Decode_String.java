package uz.mirzokhidkh.stack.medium;

import java.util.Stack;

public class P394_Decode_String {

    public String decodeString(String s) {



        int n = s.length();
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String res="";
        int i=0;

        while (i<n) {

            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int count = 0;

                while(Character.isDigit(s.charAt(i))){
                    count=10*count+(s.charAt(i)-'0');
                    i++;
                }
                counts.push(count);
            }else if(c=='['){
                result.push(res);
                res="";
                i++;
            }else if(c==']'){
                String temp= result.pop();
                int count = counts.pop();
                for(int j=0;j<count;j++){
                    temp+=res;
                }
                res=temp.toString();
                i++;
            }else{
                res+=c;
                i++;
            }

        }


        return res;

    }



}
