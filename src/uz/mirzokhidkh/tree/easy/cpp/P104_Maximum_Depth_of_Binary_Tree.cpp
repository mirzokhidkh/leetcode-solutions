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
    //iterative approach (using stack)
    int maxDepth(TreeNode* root) {
        if(!root) return 0;

        int maxDepth = 0;
        stack<pair<int,TreeNode*>> stack;
        stack.push({1,root});

        while(!stack.empty()){
            auto p = stack.top();

            int curDepth = get<0>(p);
            TreeNode* curNode = get<1>(p);
            maxDepth = max(curDepth,maxDepth);

            stack.pop();

            if(curNode->left){
                stack.push({curDepth+1,curNode->left});
            }

            if(curNode->right){
                stack.push({curDepth+1,curNode->right});
            }
        }
        return maxDepth;
    }

    //recursive approach
    int maxDepth2(TreeNode* root) {
        if(!root) return 0;

        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);

        return max(leftDepth,rightDepth) + 1;
    }
};