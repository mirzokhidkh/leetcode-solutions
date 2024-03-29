class Solution {
public:
    // int directions[4][2] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    bool exist(vector<vector<char>>& board, string word) {

        for(int i = 0; i < board.size(); i++){
            for(int j = 0; j < board[0].size(); j++){
                if(dfs(board,i,j,word,0)){
                    return true;
                }
            }
        }

        return false;
    }

    bool dfs(vector<vector<char>>& grid, int i, int j,string word, int pos){
        if(pos >= word.length()) return true;

        // if(!isValid(grid,i,j, word[pos])) return false;
       if(i < 0 || j < 0 || i >= grid.size() || j >= grid[0].size() || grid[i][j] != word[pos])
            return false;

        grid[i][j] = '#';

        // cout<<"grid["<<i<<"]["<<j<<"] = "<<grid[i][j]<<endl;

        bool up    = dfs(grid,i-1,j,word,pos+1);
        // if(up) return true;

        bool right = dfs(grid,i,j+1,word,pos+1);
        // if(right) return true;

        bool down  = dfs(grid,i+1,j,word,pos+1);
        // if(down) return true;

        bool left  = dfs(grid,i,j-1,word,pos+1);

        grid[i][j] = word[pos];

        // return left;

        return up || right || down || left ;
    }


    // bool isValid(vector<vector<char>> grid, int i, int j, char c){
    //     return i > -1 && i < grid.size() && j > -1 && j < grid[0].size() && grid[i][j] == c;
    // }
};