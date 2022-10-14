package uz.mirzokhidkh.tree.medium;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class P105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    static Map<Integer, Integer> mp = new HashMap<>();
    static int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        for (int i = 0; i < n; i++) {
            mp.put(inorder[i], i);
        }

        index = 0;
        return build(preorder, 0, n - 1);
    }

    public TreeNode build(int[] pre, int iStrt, int iEnd) {
        if (iStrt > iEnd) return null;

        int curr = pre[index];
        TreeNode node = new TreeNode(curr);
        (index)++;

        if (iStrt == iEnd) return node;

        int iInd = mp.get(curr);

        node.left = build(pre, iStrt, iInd - 1);
        node.right = build(pre, iInd + 1, iEnd);

        return node;
    }

}
