class Solution {
public:
    unordered_map<string,int> cache;

    vector<vector<int>> generate(int numRows) {

        vector<vector<int>> res;

        for(int i = 1; i<= numRows;i++ ){
            vector<int> row;
            for(int j = 1; j<=i; j++ ){
                row.push_back(calculate(i,j));
            }
            res.push_back(row);
            row.clear();
        }

        return res;
    }

    int calculate(int i, int j){
        string key = to_string(i)+"-"+to_string(j);
        if(cache.count(key)){
            return cache[key];
        }
        if(j == 1 || i == j) return 1;
        int result  = calculate(i-1,j-1) + calculate(i-1,j);
        cache[key] = result;
        return result;
    }
};