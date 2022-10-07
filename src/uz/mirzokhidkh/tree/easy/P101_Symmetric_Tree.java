package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

public class P101_Symmetric_Tree {

    //RECURSIVE SOLUTION

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;

        if ((l == null || r == null) || (l.val != r.val)) return false;

        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }

}
