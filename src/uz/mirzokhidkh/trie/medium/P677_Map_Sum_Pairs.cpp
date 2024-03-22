struct TrieNode{
    unordered_map<char,TrieNode*> children;
    int val;

};

class MapSum {
private:
    TrieNode* root;
public:
    MapSum() {
        root = new TrieNode();
    }

    void insert(string key, int val) {
            TrieNode* cur = root;
            for(int i = 0;i < key.length(); i++){
                char c = key[i];
                if(!cur->children.contains(c)){
                    cur->children.insert({c,new TrieNode()});

                }
                cur = cur->children[c];
            }
             cur->val = val;
    }

    int sum(string prefix) {

        int su = 0;
        TrieNode* cur = root;
        for(int i = 0;i < prefix.length(); i++){
            char c = prefix[i];
            if(!cur->children.contains(c)){
                return 0;
            }
            cur = cur->children[c];
        }
        su += cur->val;

        sumOthers(cur,su);

        return su;

    }

    void sumOthers(TrieNode* node, int& su){
        unordered_map children = node->children;

        if(children.size() > 0){
            for(auto& p : children){
                sumOthers(p.second,su);
                su += p.second->val;
            }
        }
    }
};

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum* obj = new MapSum();
 * obj->insert(key,val);
 * int param_2 = obj->sum(prefix);
 */