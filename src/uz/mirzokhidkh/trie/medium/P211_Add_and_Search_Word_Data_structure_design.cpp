class TrieNode{
public:
    unordered_map<char,TrieNode*> children;
    bool isWord;

    TrieNode(){
        isWord = false;
    }
};
class WordDictionary {
private:
    TrieNode* root;
public:
    WordDictionary() {
        root = new TrieNode();

    }

    void addWord(string word) {
        TrieNode* cur = root;
        for(char c : word){
            if(!cur->children.count(c)){
                cur->children[c] = new TrieNode();
            }
            cur = cur->children[c];
        }
        cur->isWord = true;
    }

    bool search(string word) {
        return dfs(root,0,word);
    }

    bool dfs(TrieNode* node,int j, string word){
        TrieNode* cur = node;
        for(int i = j; i < word.length();i++){
            char c = word[i];
            if(c == '.'){
                for(auto& p : cur->children){
                    if(dfs(p.second,i+1,word)){
                        return true;
                    }
                }
                return false;
            }else{
                if(!cur->children.count(c)){
                    return false;
                }
                cur = cur->children[c];
            }
        }
        return cur->isWord;
    }
};

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary* obj = new WordDictionary();
 * obj->addWord(word);
 * bool param_2 = obj->search(word);
 */