class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {

        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board[0].size(); j++){
                // vector<vector<bool>> visited(, vector<bool>(, false ));
                vector<vector<bool>> visited(board.size(), vector<bool> (board[0].size(), false));

                if(dfs(board,i,j,visited,word,0)){
                    return true;
                }
            }
        }

        return false;
    }

    bool dfs(vector<vector<char>>& grid, int i, int j,vector<vector<bool>> visited,string word, int pos){
        if(pos == word.length()) return true;

        if(!isValidIndex(grid.size(),grid[0].size(),i,j,visited)) return false;

        if(grid[i][j] != word[pos]) return false;

        visited[i][j] = true;

        if(grid[i][j] == word[pos]) {
            cout<<"grid["<<i<<"]["<<j<<"] = "<<grid[i][j]<<endl;
        }

        bool up = dfs(grid,i-1,j,visited,word,pos+1);
        bool down = dfs(grid,i+1,j,visited,word,pos+1);
        bool left = dfs(grid,i,j-1, visited, word,pos+1);
        bool right = dfs(grid,i,j+1, visited, word,pos+1);

        return up || down || left || right;
    }


    bool isValidIndex(int m, int n, int i, int j,vector<vector<bool>> visited){
        return i > -1 && i < m && j > -1 && j < n && !visited[i][j];
    }
};