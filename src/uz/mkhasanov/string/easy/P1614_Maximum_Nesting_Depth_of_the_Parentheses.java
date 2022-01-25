package uz.mkhasanov.string.easy;

public class P1614_Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        System.out.println(getNestingDepth(0, "(1+(2*3)+((8)/4))+1")); //3
//        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1")); //3
//        System.out.println(maxDepth("(1)+((2))+(((3)))"));  //3
//        System.out.println(maxDepth("+(+(+)+)+"));  //2
//        System.out.println(maxDepth("()"));  //0
    }


    public static int maxDepth(String s) {
        int maxND = 0;
        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                maxND = Math.max(maxND, getNestingDepth(i, s));
            }

        }
        return maxND;
    }


    public static int getNestingDepth(int pos, String s) {
        int maxND = 0;
        int maxLeft = 0;
        int lCount = 0, rCount = 0, l = pos - 1, r = pos + 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                maxLeft++;
                if (maxLeft >= 0)
                    maxND++;
            }

            int maxRight = 0;
            if (s.charAt(i) != ')') {
                maxLeft--;
            }
        }
        return maxND-1;
    }


//    public static int maxDepth(String s) {
//        int maxND = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)!='(' || s.charAt(i)!=')') {
//                maxND = Math.max(maxND, getNestingDepth(i, s));
//            }
//        }
//        return maxND;
//    }
//
//    public static int getNestingDepth(int pos, String str) {
//        int lCount = 0, rCount = 0, l = pos - 1, r = pos + 1;
//
//        while (l >= 0 && r < str.length()) {
//            if (str.charAt(l) == '(') {
//                lCount++;
//            } else if (str.charAt(l) == ')') {
//                lCount--;
//
//            }
//            if (str.charAt(r) == ')') {
//                rCount++;
//            } else if (str.charAt(r) == '(') {
//                rCount--;
//            }
//
//            l--;
//            r++;
//        }
//        return Math.max(lCount,rCount);
//    }

}
