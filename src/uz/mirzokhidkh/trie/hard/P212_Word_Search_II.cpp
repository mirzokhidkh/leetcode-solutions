class TrieNode{
public:
  unordered_map<char,TrieNode*> children;
  bool isWord;

  TrieNode(){
    isWord = false;
  }
};

class Solution {
private:
    TrieNode* root;
    void addWord(string& word){
        TrieNode* cur = root;
        for(char c : word){
            if(!cur->children.count(c)){
                cur->children[c] = new TrieNode();
            }
            cur = cur->children[c];
        }
        cur->isWord = true;
    }

public:
    vector<string> findWords(vector<vector<char>>& board, vector<string>& words) {
        root = new TrieNode();
        for (string& word : words) {
            addWord(word);
        }

        vector<string> res;

        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board[0].size(); j++){
                string word;
                backtracking(i,j,board,root,res,word);
            }
        }

        return res;
    }

    void backtracking(int i, int j,vector<vector<char>>& grid, TrieNode* node, vector<string>& res, string& word){
        if(i < 0 || j < 0 || i >= grid.size() || j >= grid[0].size() || grid[i][j] == '#' || !node->children.count(grid[i][j]))
            return;

        int temp = grid[i][j];
        node = node->children[temp];
        word.push_back(temp);
        grid[i][j] = '#';

        if(node->isWord){
            node->isWord = false;
            res.push_back(word);
        }

        vector<pair<int,int>> directions{{-1,0},{0,1},{1,0},{0,-1}}; //clock direction ->  up,right,down,left

        for(auto& dir: directions){
            int ni = i + dir.first, nj = j + dir.second;
            backtracking(ni,nj,grid,node,res,word);
        }

        // cout<<"["<<i<<"]["<<j<<"] = "<<word<<endl;

        grid[i][j] = temp;
        word.pop_back();

    }


};