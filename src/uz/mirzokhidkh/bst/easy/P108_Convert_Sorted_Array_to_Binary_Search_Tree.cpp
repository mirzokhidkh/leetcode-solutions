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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        TreeNode* root;

        binarySearch(nums,root,0, nums.size()-1);

        return root;
    }

    void binarySearch(vector<int>& nums, TreeNode*& node, int l, int r) {
        if(l > r) return;

        int mid = l+(r-l)/2;

        node =  new TreeNode(nums[mid]);

        binarySearch(nums, node->left , l, mid-1);

        binarySearch(nums, node->right, mid+1, r);
    }

};


class Solution2 {
public:
    TreeNode* sortedArrayToBST2(vector<int>& nums) {
        return binarySearch2(nums,0, nums.size()-1);
    }

    TreeNode* binarySearch2(vector<int>& nums, int l, int r) {
        if(l > r) return nullptr;
        int mid = l+(r-l)/2;
        TreeNode* node =  new TreeNode(nums[mid]);
        node->left = binarySearch(nums, l, mid-1);
        node->right = binarySearch(nums, mid+1, r);
        return node;
        }

};