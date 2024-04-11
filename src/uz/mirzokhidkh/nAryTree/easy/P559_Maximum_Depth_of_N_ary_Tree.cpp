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
//  recursive approach
    int maxDepth(Node* root) {
        if(!root) return 0;
        // else if(root->children.empty()) return 1;

        // vector<int> heights;
        int max_depth = 0;
        for(auto* child : root->children){
            max_depth = max(maxDepth(child),max_depth);
            // heights.push_back(maxDepth(child));
        }

        // return *max_element(heights.begin(),heights.end())+1;
        return max_depth+1;
    }

    //2-approach
//     int maxDepth(Node* root) {
//         int max = 0;
//         maxDepth(root,max,1);
//         return max;
//     }

//     void maxDepth(Node* root, int& maxD, int d){
//         if(!root) return;
//         maxD = max(maxD,d);

//         for(Node* child : root->children){
//             maxDepth(child,maxD,d+1);
//         }
//     }
};