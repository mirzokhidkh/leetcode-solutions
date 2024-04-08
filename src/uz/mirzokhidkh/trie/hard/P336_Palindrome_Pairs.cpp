class Solution {
public:
    vector<vector<int>> palindromePairs(vector<string>& words) {
        vector<vector<int>> res;
        unordered_map<string,int> wordSet;

        for(int i = 0; i < words.size(); i++){
            wordSet[words[i]] = i;
        }


        // string rev = string(word.rbegin(), word.rend());

        // if(map.count(rev)){
        //     res.push_back({map[rev],i});
        //     res.push_back({i,map[rev]});
        // }

        for(const pair<string,int>& p : wordSet){

            string word = p.first;
            int curInd = p.second;

            string reversedWord = string(word.rbegin(), word.rend());

            // reverse(curWord.begin(),curWord.end());

            if(wordSet.count(reversedWord) && wordSet[reversedWord] != curInd){
                res.push_back({curInd, wordSet[reversedWord]});
            }

            for(string suffix : allValidSuffixes(word)){
                string reversedSuffix = string(suffix.rbegin(), suffix.rend());

                if(wordSet.count(reversedSuffix)){
                    res.push_back({wordSet[reversedSuffix],curInd});
                }
            }

            for(string prefix : allValidPrefixes(word)){
                string reversedPrefix = string(prefix.rbegin(), prefix.rend());

                if(wordSet.count(reversedPrefix)){
                    res.push_back({curInd, wordSet[reversedPrefix]});
                }
            }

        }

        return res;
    }

    vector<string> allValidSuffixes(string& word){
        vector<string> res;

        for(int i=0; i<word.length(); i++){
            // string s = word.substr(0,i+1);
            //  if(isPalindrome(s)){
            if(isPalindrome(word,0,i)){
                res.push_back(word.substr(i+1));
            }
        }

        return res;
    }

    vector<string> allValidPrefixes(string& word){
        vector<string> res;

        for(int i=0; i<word.length(); i++){
            // string s = word.substr(i);
            // if(isPalindrome(s)){
            if(isPalindrome(word,i,word.length()-1)){
                res.push_back(word.substr(0,i));
            }
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

    bool isPalindrome(string& word, int front, int back) {
        while (front < back) {
            if (word[front] != word[back]) return false;
            front++;
            back--;
        }
        return true;
    }
};

//Testcases passed, but took too long.
