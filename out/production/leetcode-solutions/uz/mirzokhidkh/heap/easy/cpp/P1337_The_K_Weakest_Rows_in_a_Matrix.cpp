struct myComp{
     bool operator()(
        pair<int,int> const& p1,
        pair<int,int> const& p2){
           if(p1.second < p2.second){
               return true;
           }else if(p1.second == p2.second && p1.first < p2.first){
               return true;
           }
           return false;
        }

};

class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        priority_queue<pair<int,int>,vector<pair<int,int>>,myComp> pq;

        map<int,int> map;
        int j = 0;
        for(vector row : mat){
            int sum = 0;
            for(int i : row){
                sum += i;
            }
            pq.push(make_pair(j++,sum));

            if(pq.size()>k){
                pq.pop();
            }
        }

        vector<int> res;

        while(pq.size()){
            pair p = pq.top();
            pq.pop();
            res.push_back(p.first);
        }

        reverse(res.begin(),res.end());
        return res;
    }
};