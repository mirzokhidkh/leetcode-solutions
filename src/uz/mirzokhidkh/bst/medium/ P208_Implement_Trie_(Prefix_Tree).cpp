class Trie {
private:
   set<string> set;
public:
    Trie() {}

    void insert(string word) {
        set.insert(word);

    }

    bool search(string word) {
        return set.count(word);
    }

    bool startsWith(string prefix) {
        for(string s : set){
            if(s.starts_with(prefix)){
                return true;
            }
        }
        return false;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */