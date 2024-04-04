class Solution {
public:
    vector<vector<int>> palindromePairs(vector<string>& words) {
        vector<vector<int>> res;
        unordered_map<string,int> map;

        for(int i = 0; i < words.size(); i++){
            string word = words[i];

            // string rev = string(word.rbegin(), word.rend());

            // if(map.count(rev)){
            //     res.push_back({map[rev],i});
            //     res.push_back({i,map[rev]});
            // }

            for(const pair<string,int>& p : map){
                string v1 = word + p.first;
                string v2 = p.first + word;
                if(isPalindrome(v1)){
                    res.push_back({i,p.second});
                }
                if(isPalindrome(v2)){
                    res.push_back({p.second,i});
                }
            }
            map[word] = i;
        }
        return res;
    }


    bool isPalindrome(string& s){
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s[l++] != s[r--]) return false;
        }
        return true;
    }


};