package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

public class P112_Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) return targetSum == root.val;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
