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
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        if(!root) return new TreeNode(val);

        TreeNode* curr = root;
        TreeNode* parent;

        while(curr){
            parent = curr;
            curr = (val > curr->val) ? curr->right : curr->left;
        }

        if(val > parent->val){
            parent->right = new TreeNode(val);
        }else{
             parent->left = new TreeNode(val);
        }

        return root;
    }
};