package uz.mirzokhidkh.tree.easy;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


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
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
//        tree.right = new TreeNode(3);
//        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(2);

        System.out.println(preorderTraversal(tree)); // EXPECTED VALUE: [1, 2, 4,5, 3]
    }


    //RECURSION APPROACH

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


    //ITERATIVE APPROACH
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;
    }
}


