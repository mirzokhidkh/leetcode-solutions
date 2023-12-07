struct myComp{
     bool operator()(
        pair<vector<int>,int> const& p1,
        pair<vector<int>,int>const& p2){
           if(p1.second < p2.second){
               return true;
           }
           return false;
        }

};

class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {


        priority_queue<pair<vector<int>,int>,vector<pair<vector<int>,int>>,myComp> pq;

        for(vector row : points){
            int dis = 0;
            for(int i : row){
                dis += pow(i,2);
            }
            // pq.push(make_pair(row,dis));
             pq.push({row,dis});

            if(pq.size()>k){
                pq.pop();
            }
        }

        vector<vector<int>> res;

        while(pq.size()){
            pair p = pq.top();
            pq.pop();
            res.push_back(p.first);
        }

        return res;
    }
};