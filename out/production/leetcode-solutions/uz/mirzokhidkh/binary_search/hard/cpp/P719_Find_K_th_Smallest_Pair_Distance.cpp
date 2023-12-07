class Solution {
public:
    int smallestDistancePair(vector<int>& nums, int k) {

        sort(nums.begin(),nums.end());

        //for (const auto i: nums) {cout << i << ' ';}

        priority_queue <int> pq;

        for(int i = nums.size()-1; i >=0; i--){
            if(i > 0 && nums[i] == nums[i-1])
            continue;

            // if(i-1 >= 0 && nums[i] != nums[i-1]){
                for(int j = 0; j < i; j++){
                    int dif = nums[i] - nums[j];
                    if(k > 0){
                        pq.push(dif);
                        --k;
                    }else if(dif < pq.top()){
                        pq.pop();
                        pq.push(dif);
                    }
                }
            // }
        }

        return pq.top();
    }
};