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
    bool isValidBST(TreeNode* root) {
        if(root == nullptr) return true;

        TreeNode *left = root->left;
        if( left != nullptr && (root->val < left->val)) return false;
        bool isValidLeft = isValidBST(left);

        TreeNode *right = root->right;
        if(right != nullptr && (root->val > right->val)) return false;
        bool isValidRight= isValidBST(right);

        return isValidLeft && isValidRight;

    }
};