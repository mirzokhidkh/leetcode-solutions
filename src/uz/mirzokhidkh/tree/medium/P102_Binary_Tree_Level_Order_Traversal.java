package uz.mirzokhidkh.tree.medium;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P102_Binary_Tree_Level_Order_Traversal {
    //DFS approach
// START
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        int h = height(root, 0);

        for (int i = 1; i <= h; i++) {
            List<Integer> curr = new ArrayList<>();
            levelOrder(root, i, curr);
            list.add(curr);
        }
        return list;
    }

    public void levelOrder(TreeNode node, int i, List<Integer> list) {
        if (node != null) {
            if (i == 1) {
                list.add(node.val);
            } else {
                levelOrder(node.left, i - 1, list);
                levelOrder(node.right, i - 1, list);
            }
        }
    }

    public int height(TreeNode node, int h) {
        if (node == null) return h;
        return Math.max(height(node.left, h + 1), height(node.right, h + 1));
    }

// END



}
