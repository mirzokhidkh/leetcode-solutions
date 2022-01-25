package uz.mkhasanov.tree.easy;

import uz.mkhasanov.tree.TreeNode;

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


public class P145_Binary_Tree_Postorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        System.out.println(postorderTraversal(tree)); // EXPECTED VALUE: [4, 5, 2,3,1]
    }


    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        return postorderTraversal(root, values);
    }

    public static List<Integer> postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
        return list;
    }
}


