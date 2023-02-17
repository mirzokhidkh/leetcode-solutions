package uz.mirzokhidkh.tree.medium;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P95_Unique_Binary_Search_Trees_II {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }

        return helper(1, n);
    }


    public List<TreeNode> helper(int m, int n) {

        List<TreeNode> res = new ArrayList<TreeNode>();

        if (m > n) {
            res.add(null);
            return res;
        }

        for (int i = m; i <= n; i++) {

            List<TreeNode> ls = helper(m, i - 1);
            List<TreeNode> rs = helper(i + 1, n);
            for (TreeNode l : ls) {
                for (TreeNode r : rs) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    res.add(curr);
                }
            }
        }
        return res;
    }
}
