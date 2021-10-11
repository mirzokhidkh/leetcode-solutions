package uz.mkhasanov;

public class P543_Diameter_of_Binary_Tree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);

        TreeNode tree3 = new TreeNode(2);
        tree3.left = new TreeNode(3);
        tree3.left.left = new TreeNode(1);

        TreeNode tree4 = new TreeNode(2);
        tree4.left = new TreeNode(1);
        tree4.right = new TreeNode(4);
        tree4.left.left = new TreeNode(3);
        tree4.right.left = new TreeNode(4);


//        System.out.println(height(tree));
        System.out.println(diameterOfBinaryTree(tree1));//3
        System.out.println(diameterOfBinaryTree(tree2));//1
        System.out.println(diameterOfBinaryTree(tree3));//2
        System.out.println(diameterOfBinaryTree(tree4));//4

    }

    static int max = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
//        if (root.left == null && root.right == null) {
//            return 0;
//        }
        height(root);
//        return subDiameter(root, 1);
        return max - 1;
    }


//    public static int subDiameter(TreeNode node, int maxD) {
//        if (node == null) {
//            return maxD;
//        }
//
//        int lheight = node.left != null ? height(node.left) : -1;
//        int rheight = node.right != null ? height(node.right) : -1;
//
//        maxD = Math.max(maxD, (lheight != -1 ? lheight : 0) + (rheight != -1 ? rheight : 0) + (lheight != -1 ? 1 : 0) + (rheight != -1 ? 1 : 0));
//        return Math.max(subDiameter(node.left, maxD), subDiameter(node.right, maxD));
//
////        maxSubDiameter(node.left, maxD);
////        maxSubDiameter(node.right, maxD);
////        return maxD;
//    }


    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);
        max = Math.max(max, 1 + lheight + rheight);

        return (Math.max(lheight, rheight) + 1);
    }

}
