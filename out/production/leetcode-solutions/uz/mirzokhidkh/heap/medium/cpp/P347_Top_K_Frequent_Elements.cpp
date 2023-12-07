class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int> map;
        for(int i: nums){
            map[i]++;
        }

        priority_queue<int> pq;

        for (const auto& kv : map) {
            pq.push(kv.second);
        }

        vector<int> ans;
        while(k > 0){
            int i = pq.top();
            for (auto& it : map) {
                if(it.second == i && k>0){
                    ans.push_back(it.first);
                    map.erase(it.first);
                    k--;
                }
            }

            pq.pop();
        }

        return ans;
    }
};