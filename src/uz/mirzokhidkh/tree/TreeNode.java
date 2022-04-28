package uz.mirzokhidkh.tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

   public TreeNode(int val, uz.mirzokhidkh.tree.TreeNode left, uz.mirzokhidkh.tree.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return " val=>" + val +
                " left=" + left +
                " right=" + right;
    }

}
