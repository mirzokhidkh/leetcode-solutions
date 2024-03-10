class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int indexDiff, int valueDiff)
    {

         map<int,vector<int>> mp;

         for(int i = 0; i<nums.size(); i++){
             int key= nums[i];
             if(mp.find(key) != mp.end()){
                 mp[key].push_back(i);
             }else{
                 vector<int> ind;
                 ind.push_back(i);
                 mp[key] = ind;
             }
         }

//     for (const auto& entry : mp) {
//         int key = entry.first;
//         const vector<int>& values = entry.second;

//         cout << "Key: " << key << ", Values: ";
//         for (int element : values) {
//             cout << element << " ";
//         }
//         cout << endl;
//     }


    for(const auto& entry : mp){
        int cur = entry.first;
        const vector<int>& curVals = entry.second;

         for(const auto& entry2 : mp){
            int key = entry2.first;
            const vector<int>& vals = entry2.second;

            if(abs(cur-key) <= valueDiff){
                for(int i = 0 ; i < curVals.size();i++){
                    for(int j = 0; j< vals.size();j++){
                        if(cur==key && i==j) continue;
                        if(abs(curVals[i]-vals[j]) <= indexDiff ){
                            return true;
                        }
                    }
                }
            }



         }


    }




         return false;
    }
};