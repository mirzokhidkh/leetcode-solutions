class TrieNode{
public:
    TrieNode *child[26];
    bool isWord;
        TrieNode(){
            for(auto &i : child){
                i = nullptr;
            }
            isWord = false;
        }


};

class Trie {
private:
    TrieNode* root;
public:
    Trie() {
        root = new TrieNode();
    }

    void insert(string word) {

        TrieNode* cur = root;
        for(auto &a: word){
            int i = a-'a';
            if(!cur->child[i]){
                cur->child[i] =  new TrieNode();
            }
            cur = cur->child[i];
        }
        cur->isWord = true;
    }

    bool search(string word, bool isPrefix = false) {
        TrieNode* cur = root;
        for(auto &a: word){
            int i = a-'a';
            if(!cur->child[i]) return false;
            cur = cur->child[i];
        }
        if(!isPrefix)return cur->isWord;
        return true;
    }

    bool startsWith(string prefix) {
        return search(prefix,true);
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */