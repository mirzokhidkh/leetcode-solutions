package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


//  Definition for a binary tree node.
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}


public class P144_Binary_Tree_Preorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        System.out.println(preorderTraversal(tree)); // EXPECTED VALUE: [1, 2, 4,5, 3]
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        return preorderTraversal(root, values);
    }

    public static List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
        return list;
    }
}


