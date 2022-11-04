package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

public class P700_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        if (root.val == val) return root;

        TreeNode left = searchBST(root.left, val);
        TreeNode right = searchBST(root.right, val);

        return left != null ? left : right;
    }

}
