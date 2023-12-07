class Solution {
public:
    int findDuplicate(vector<int>& v) {

        unordered_set<int> set;

        for(int i : v){
            if(set.find(i) != set.end()){
                return i;
            }
            set.insert(i);
        }
     return -1;
    }
};