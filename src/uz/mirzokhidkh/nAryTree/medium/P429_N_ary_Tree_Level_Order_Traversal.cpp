/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>> res;
        if(!root) return res;
        queue<Node*> que;
        que.push(root);

        while(!que.empty()){

            vector<int> curLevel;
            int size = que.size();

            while(size-- > 0){
                Node* cur = que.front();
                curLevel.push_back(cur->val);
                que.pop();

                for(Node* node: cur->children){
                    que.push(node);
                }
            }

            res.push_back(curLevel);
        }

        return res;
    }
};