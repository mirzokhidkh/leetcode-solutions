/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* deleteNode(TreeNode* root, int key) {
        if (!root) return root;

        if (key < root->val) {
            // cout << "LEFT" << endl;
            root->left = deleteNode(root->left, key);
        } else if (key > root->val) {
            // cout << "RIGHT" << endl;
            root->right = deleteNode(root->right, key);
        }else{
            if(!root->left) return root->right;
            else if(!root->right) return root->left;

            TreeNode* cur = root->left;
            while(cur->right){
                cur = cur->right;
            }
            root->val = cur->val;
            root->left = deleteNode(root->left,cur->val);

        }

        return root;
    }

};