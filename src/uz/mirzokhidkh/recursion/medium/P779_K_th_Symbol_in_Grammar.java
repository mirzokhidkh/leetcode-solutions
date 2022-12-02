package uz.mirzokhidkh.recursion.medium;

public class P779_K_th_Symbol_in_Grammar {
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;

        if (k % 2 == 0) {
            int v = kthGrammar(n - 1, k / 2);
            return v == 0 ? 1 : 0;
        }

        return kthGrammar(n - 1, (k + 1) / 2);
    }
}
