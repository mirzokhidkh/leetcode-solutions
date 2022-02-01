package uz.mkhasanov.tree.easy;


import uz.mkhasanov.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


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

    //BFS-APPROACH
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }


    //RECURSIVE-APPROACH
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        if (root == null) {
//            return new ArrayList<>();
//        }
//        List<Integer> values = new ArrayList<>();
//        inorderTraversal(values,root);
//        return values;
//    }
//
//    public static void inorderTraversal(List<Integer> values, TreeNode root) {
//        if (root==null){
//            return;
//        }
//        inorderTraversal(values,root.left);
//        values.add(root.val);
//        inorderTraversal(values,root.right);
//    }

}


