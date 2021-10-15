package uz.mkhasanov;

public class Main {

    public static void main(String[] args) {
        String s = "aabaaabc";
        String s1 = "aaaaddddaaadffffggggaaa";
        String s2 = "ddssssdddffffggssgg";
//        System.out.println(s.substring(2));
        System.out.println(doUnique(s));
        System.out.println(doUnique(s1));
        System.out.println(doUnique(s2));
    }


    public static String doUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    s = s.substring(0, j) + s.substring(j + 1);
                    j = s.indexOf(s.charAt(i));
                }
            }
        }
        return s;
    }
}
