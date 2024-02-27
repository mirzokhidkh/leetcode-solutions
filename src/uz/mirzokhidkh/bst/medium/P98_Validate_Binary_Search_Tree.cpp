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
       return isValidBST(root, nullptr, nullptr);
     }
    bool isValidBST(TreeNode* root,TreeNode* minNode,TreeNode* maxNode) {
        if(root == nullptr) return true;
        int val = root->val;


        if(minNode  && (minNode->val >= val)) return false;
        if(maxNode && (maxNode->val <= val)) return false;


        return isValidBST(root->left,minNode,root) && isValidBST(root->right,root,maxNode);
    }



};