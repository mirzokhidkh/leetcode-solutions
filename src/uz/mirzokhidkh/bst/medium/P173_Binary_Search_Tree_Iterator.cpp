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
class BSTIterator {
private:
    queue<int> queue;

    void addInOrder(TreeNode* root){
      if(root == nullptr) return;
      addInOrder(root->left);
      queue.push(root->val);
      addInOrder(root->right);
    }

public:
    BSTIterator(TreeNode* root) {
        addInOrder(root);
    }

    int next() {
        int cur = queue.front();
        queue.pop();
        return cur;
    }

    bool hasNext() {
        return queue.size() != 0;
    }

};

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator* obj = new BSTIterator(root);
 * int param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */