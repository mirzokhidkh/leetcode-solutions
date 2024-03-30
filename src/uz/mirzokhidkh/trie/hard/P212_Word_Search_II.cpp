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
                // word.push_back(board[i][j]);
                dfs(i,j,board,root,res,word);
            }
        }

        return res;
    }

    void dfs(int i, int j,vector<vector<char>>& grid, TrieNode* node, vector<string>& res, string word){
      if(i < 0 || j < 0 || i >= grid.size() || j >= grid[0].size()) return;

      if(node->children.size()){
        for(pair p : node->children){
            if(p.first == grid[i][j]){
                word.push_back(grid[i][j]);
                grid[i][j] = '#';

                // cout<<word<<"-"<<endl;

                if(p.second->isWord && !count(res.begin(), res.end(), word)){
                    // cout<<word<<endl;
                    res.push_back(word);
                }
                dfs(i-1,j,grid,p.second,res,word);
                dfs(i,j+1,grid,p.second,res,word);
                dfs(i+1,j,grid,p.second,res,word);
                dfs(i,j-1,grid,p.second,res,word);

                grid[i][j] = p.first;

            }
        }
      }
    }


};