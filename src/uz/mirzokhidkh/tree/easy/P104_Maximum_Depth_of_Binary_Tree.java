package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

public class P104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        return bottomUp(root);
    }

    public int bottomUp(TreeNode node) {
        if (node == null) return 0;

        int l = bottomUp(node.left);
        int r = bottomUp(node.right);

        return Math.max(l, r) + 1;
    }
}
