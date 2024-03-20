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
    int n;

    void addBST(int val){

        TreeNode* prev = nullptr;
        TreeNode* cur = root;

        while(cur){
            prev = cur;
            cur = (val < cur->val) ? cur->left : cur->right;
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

        ++n;
        return;

    }


    void searchK(TreeNode* node,int& k, bool &found){
        if(node){

            searchK(node->left,k,found);

            if(!found && k == 0){
                num = node->val;
                found = true;
                return;
            }
            --k;
            searchK(node->right,k,found);
        }
        return;
    }


public:
    KthLargest(int k, vector<int>& nums) {
        root = nullptr;
        num = 0;
        n = 0;
        for(int i=0; i < nums.size(); i++){
            addBST(nums[i]);
        }

        this->k = k;
    }

    int add(int val) {
        addBST(val);
        int m = n-k;
        bool found = false;
        searchK(root,m,found);
        return num;
    }

};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */