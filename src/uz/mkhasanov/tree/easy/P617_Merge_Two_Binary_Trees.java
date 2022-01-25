package uz.mkhasanov.tree.easy;

////  Definition for a binary tree node.
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


import uz.mkhasanov.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P617_Merge_Two_Binary_Trees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
//        root1.left.left.left = new TreeNode(5);
//        root1.right.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

//        System.out.println(height(root1));
//        System.out.println(height(root2));
//        System.out.println(height(root2,0));
//        System.out.println(levelOrderTraversal(root1)); //EXPECTED VALUE: [1,3,2,5]
        System.out.println(levelOrderTraversal(mergeTrees(root1, root2))); // EXPECTED VALUE: [3,4,5,5,4,null,7]
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{root1, root2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();

            if (t[0] == null || t[1] == null) {
                continue;
            }

            t[0].val += t[1].val;

            if (t[0].left == null) {
                t[0].left = t[1].left;
            }else {
                stack.push(new TreeNode[]{t[0].left , t[1].left});
            }

            if (t[0].right == null) {
                t[0].right = t[1].right;
            }else {
                stack.push(new TreeNode[]{t[0].right , t[1].right});
            }
        }

        return root1;
    }

//    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if (root1 == null)
//            return root2;
//        if (root2 == null)
//            return root1;
//
//        root1.val += root2.val;
//        root1.left = mergeTrees(root1.left, root2.left);
//        root1.right = mergeTrees(root1.right, root2.right);
//        return root1;
//    }


    public static List<Integer> levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> values = new ArrayList<>();
        int h = height(root, 0);
        for (int i = 1; i <= h + 1; i++) {
            levelOrderTraversal(values, root, i);
        }
        return values;
    }

    public static void levelOrderTraversal(List<Integer> values, TreeNode root, int level) {
        if (root == null) {
            values.add(null);
            return;
        }
        if (level == 1) {
            values.add(root.val);
        } else {
            levelOrderTraversal(values, root.left, level - 1);
            levelOrderTraversal(values, root.right, level - 1);
        }
    }

    public static int height(TreeNode node, int h) {
        if (node == null)
            return h - 1;
        int lheight = height(node.left, h + 1);
        int rheight = height(node.right, h + 1);
        return Math.max(lheight, rheight);
    }


}


