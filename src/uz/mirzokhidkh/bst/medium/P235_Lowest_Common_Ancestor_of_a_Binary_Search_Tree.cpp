/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        int v = root->val;
        int mi = min(p->val,q->val);
        int ma = max(p->val,q->val);
        if(v >= mi && v <= ma){
             return root;
        }
        return lowestCommonAncestor(v < mi ? root->right : root->left,p,q);
    }
};