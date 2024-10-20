class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<int> freq(26, 101);

        for (string& word : words) {
            vector<int> subFreq(26);
            for (char& c : word) {
                subFreq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (subFreq[i])
                    freq[i] = subFreq[i] < freq[i] ? subFreq[i] : freq[i];
                else
                    freq[i] = 0;
            }
        }

        vector<string> ans;
        for (int i = 0; i < 26; i++) {
            if (freq[i]) {
                string ins = "";
                ins += (char)(i + 'a');
                for (int j = 0; j < freq[i]; j++) {
                    ans.push_back(ins);
                }
            }
        }

        return ans;
    }
};