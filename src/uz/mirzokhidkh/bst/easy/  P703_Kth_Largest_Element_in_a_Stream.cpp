//  struct TreeNode {
//      int val;
//      TreeNode *left;
//      TreeNode *right;
//      TreeNode() : val(0), left(nullptr), right(nullptr) {}
//       TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
//       TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
//   };

class KthLargest {
private:
    TreeNode *root;
    int k;
    int num;

    void addBST(int val){

        TreeNode* prev = nullptr;
        TreeNode* cur = root;

        while(cur){
            prev = cur;
            if (val < cur->val) {
                cur = cur->left;
            } else {
                cur = cur->right;
            }
            // cur = (val < cur->val) ? cur->left : cur->right;
        }

        if(prev){
            if(val < prev->val){
                prev->left = new TreeNode(val);
            }else{
                prev->right = new TreeNode(val);
            }
        }else{
            root = new TreeNode(val);
        }

        // searchK(root,k);
        return;

    }


    void searchK(TreeNode* node,int k){
        if(!node) return;
        searchK(node->left,k--);
        if(k == 0){
            num = node->val;
        }
        searchK(node->left,k--);
        return;
    }

public:
    KthLargest(int k, vector<int>& nums) {
        root = nullptr;
        for(int i=0; i < nums.size(); i++){
            addBST(nums[i]);
        }

        this->k = k;
    }

    int add(int val) {
        addBST(val);
        searchK(root,k);
        return num;
    }

};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */