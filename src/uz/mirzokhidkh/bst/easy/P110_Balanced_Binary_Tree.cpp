/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // bool isBalanced(TreeNode* root) {
    //     return isBalanced(root,0);
    // }

    bool isBalanced(TreeNode* root) {
        if(!root) return true;
        int l = height(root->left);
        int r = height(root->right);

        return abs(l-r) <= 1 && isBalanced(root->left) && isBalanced(root->right);
    }

    int height(TreeNode* node){
        if(!node) return 0;
        return 1 + max(height(node->left), height(node->right));
    }


};