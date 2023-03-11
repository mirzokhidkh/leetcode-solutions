class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {

        priority_queue<int> pq;

        for(vector<int> row : matrix){
            for(int i : row){
                pq.push(i);
                if(pq.size() > k){
                    pq.pop();
                }
            }
        }
        return pq.top();
    }
};