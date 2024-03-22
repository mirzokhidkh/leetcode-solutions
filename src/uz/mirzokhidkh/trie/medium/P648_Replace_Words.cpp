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

    void insertWord(const string& word) {
        TrieNode* cur = root;
        for (char c : word) {
            if (!cur->children.count(c)) {
                cur->children[c] = new TrieNode();
            }
            cur = cur->children[c];
        }
        cur->isWord = true;
    }

    string getShortestPrefix(const string& word) {
        TrieNode* cur = root;
        string prefix;
        for (char c : word) {
            prefix.push_back(c);
            if(cur->children.count(c)){
                if (cur->children[c]->isWord) {
                    return prefix;
                }
                cur = cur->children[c];
            } else {
              break;
            }
        }
        return word;
    }

public:
    string replaceWords(vector<string>& dictionary, string sentence) {
        root = new TrieNode();

        for (const string& word : dictionary) {
            insertWord(word);
        }

        istringstream iss(sentence);
        string word, res;
        while (iss >> word) {
            res += getShortestPrefix(word) + " ";
        }

        if (!res.empty()) {
            res.pop_back();
        }

        return res;
    }
};
