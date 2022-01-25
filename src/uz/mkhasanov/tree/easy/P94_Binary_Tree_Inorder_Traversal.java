package uz.mkhasanov.tree.easy;


import uz.mkhasanov.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class P94_Binary_Tree_Inorder_Traversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        System.out.println(inorderTraversal(tree)); // EXPECTED VALUE: [4, 2, 5, 1, 3]
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> values = new ArrayList<>();
        inorderTraversal(values,root);
        return values;
    }

    public static void inorderTraversal(List<Integer> values, TreeNode root) {
        if (root==null){
            return;
        }
        inorderTraversal(values,root.left);
        values.add(root.val);
        inorderTraversal(values,root.right);
    }

}


