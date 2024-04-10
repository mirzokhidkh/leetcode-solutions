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
    int maxDepth(Node* root) {
        int max = 0;
        maxDepth(root,max,1);
        return max;
    }

    void maxDepth(Node* root, int& maxD, int d){
        if(!root) return;

        maxD = max(maxD,d);

        for(Node* child : root->children){
            maxDepth(child,maxD,d+1);
        }

    }
};